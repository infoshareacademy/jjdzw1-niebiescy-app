import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter

public class User

{

    String userId;
    String userName;
    String userSecondName;
    String userEmail;
    String userPhoneNumber;
    String userType;
    String userActiveFlag;
    Date userDateCreated;
    Date userDateModified;
    Date userDateRemoved;

    public void reserveEvent() {
        // reserve Event method implementation
    }

    public void unreserveEvent() {
        // unreserve Event method implementation
    }

    public void searchForEvent() {
        // search for Event method implementation
    }

    public void confirmEventParticipation() {

    }


}
