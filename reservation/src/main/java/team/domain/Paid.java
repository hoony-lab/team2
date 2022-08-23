package team.domain;

import team.domain.*;
import team.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class Paid extends AbstractEvent {

    private Long id;
    private Long reservationId;
    private Integer paymentAmount;
    private Date paymentDate;
    private String paymentStatus;

// keep

}


