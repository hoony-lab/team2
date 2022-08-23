package team.domain;

import team.domain.*;
import team.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Reserved extends AbstractEvent {

    private Long id;
    private Long roomId;
    private Long paymentId;
    private Long customerId;
    private Date reserveDate;
    private String reserveStatus;

    public Reserved(Reservation aggregate){
        super(aggregate);
    }
    public Reserved(){
        super();
    }
    // keep

}
