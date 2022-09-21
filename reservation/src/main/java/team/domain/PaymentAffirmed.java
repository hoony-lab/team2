package team.domain;

import java.util.*;
import lombok.*;
import team.domain.*;
import team.infra.AbstractEvent;

@Data
@ToString
public class PaymentAffirmed extends AbstractEvent {

    private Long id;
    private Long roomId;
    private Long paymentId;
    private Long customerId;
    private Date reserveDate;
    private String reserveStatus;

    public PaymentAffirmed(Reservation aggregate) {
        super(aggregate);
    }

    public PaymentAffirmed() {
        super();
    }
    // keep

}