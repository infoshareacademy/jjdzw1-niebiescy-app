import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
class Event {

    private String name;
    private String description;
    private Date startDate;
    private Date finishDate;
    private String address;
    private Integer organizer;
    private Double price;
    private Integer tickets;

}
