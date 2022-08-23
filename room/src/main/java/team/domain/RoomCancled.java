package team.domain;

import team.domain.*;
import team.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class RoomCancled extends AbstractEvent {

    private Long id;
    private String status;
    private String reviewCnt;
    private Double price;
    private Long reservationId;
    private Long reviewCnt;

    public RoomCancled(Room aggregate){
        super(aggregate);
    }
    public RoomCancled(){
        super();
    }
    // keep

}
