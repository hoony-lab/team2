package team.domain;

import team.domain.*;
import team.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class RoomModified extends AbstractEvent {

    private Long id;
    private String status;
    private String reviewCnt;
    private Double price;

    public RoomModified(Room aggregate){
        super(aggregate);
    }
    public RoomModified(){
        super();
    }
    // keep

}
