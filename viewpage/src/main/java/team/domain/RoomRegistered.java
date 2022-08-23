package team.domain;

import team.infra.AbstractEvent;
import lombok.Data;
import java.util.Date;

@Data
public class RoomRegistered extends AbstractEvent {

    private Long id;
    private String status;
    private String reviewCnt;
    private Double price;
    private Long reservationId;
    private Long reviewCnt;
}
