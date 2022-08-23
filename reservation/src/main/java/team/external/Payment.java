package team.external;

import lombok.Data;
import java.util.Date;
@Data
public class Payment {

    private Long id;
    private Long reservationId;
    private Integer paymentAmount;
    private Date paymentDate;
    private String paymentStatus;

    // keep

}


