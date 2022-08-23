package team.domain;

import team.domain.*;
import team.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class RoomRegistered extends AbstractEvent {

    private Long id;
    private String status;
    private String reviewCnt;
    private Double price;
    private Long reservationId;
    private Long reviewCnt;

    public RoomRegistered(Room aggregate){
        super(aggregate);
    }
    public RoomRegistered(){
        super();
    }
    // keep

}
