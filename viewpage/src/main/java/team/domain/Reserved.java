package team.domain;

import team.infra.AbstractEvent;
import lombok.Data;
import java.util.Date;

@Data
public class Reserved extends AbstractEvent {

    private Long id;
    private Long roomId;
    private Long paymentId;
    private Long customerId;
    private Date reserveDate;
    private String reserveStatus;
}
