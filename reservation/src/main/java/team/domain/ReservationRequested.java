package team.domain;

import team.domain.*;
import team.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ReservationRequested extends AbstractEvent {

    private Long id;
    private Long roomId;
    private Long paymentId;
    private Long customerId;
    private Date reserveDate;
    private String reserveStatus;

    public ReservationRequested(Reservation aggregate){
        super(aggregate);
    }
    public ReservationRequested(){
        super();
    }
    // keep

}
