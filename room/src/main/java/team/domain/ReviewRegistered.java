package team.domain;

import team.domain.*;
import team.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class ReviewRegistered extends AbstractEvent {

    private Long id;
    private Long roomId;
    private Long customerId;
    private String content;

// keep

}


