package team.domain;

import team.domain.ReservationRequested;
import team.domain.ReservationCancelRequested;
import team.domain.Reserved;
import team.domain.Canceled;
import team.ReservationApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Reservation_table")
@Data

public class Reservation  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private Long roomId;
    
    
    
    
    
    private Long paymentId;
    
    
    
    
    
    private Long customerId;
    
    
    
    
    
    private Date reserveDate;
    
    
    
    
    
    private String reserveStatus;

    @PostPersist
    public void onPostPersist(){

        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.

        team.external.Payment payment = new team.external.Payment();
        // mappings goes here
        ReservationApplication.applicationContext.getBean(team.external.PaymentService.class)
            .pay(payment);


        ReservationRequested reservationRequested = new ReservationRequested(this);
        reservationRequested.publishAfterCommit();



        ReservationCancelRequested reservationCancelRequested = new ReservationCancelRequested(this);
        reservationCancelRequested.publishAfterCommit();



        Reserved reserved = new Reserved(this);
        reserved.publishAfterCommit();



        Canceled canceled = new Canceled(this);
        canceled.publishAfterCommit();

    }

    public static ReservationRepository repository(){
        ReservationRepository reservationRepository = ReservationApplication.applicationContext.getBean(ReservationRepository.class);
        return reservationRepository;
    }




    public static void affirmPayment(Paid paid){

        /** Example 1:  new item 
        Reservation reservation = new Reservation();
        repository().save(reservation);

        */

        /** Example 2:  finding and process
        
        repository().findById(paid.get???()).ifPresent(reservation->{
            
            reservation // do something
            repository().save(reservation);


         });
        */

        
    }
    public static void affirmCancelPayment(PaymentCanceled paymentCanceled){

        /** Example 1:  new item 
        Reservation reservation = new Reservation();
        repository().save(reservation);

        */

        /** Example 2:  finding and process
        
        repository().findById(paymentCanceled.get???()).ifPresent(reservation->{
            
            reservation // do something
            repository().save(reservation);


         });
        */

        
    }


}
