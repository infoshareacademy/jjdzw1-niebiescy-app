import java.util.Date;

class Event {

    private String name;
    private String description;
    private Date startDate;
    private Date finishDate;
    private String address;
    private Integer organizer;
    private Double price;
    private Integer tickets;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getDescription() {
        return description;
    }

    void setDescription(String description) {
        this.description = description;
    }

    Date getStartDate() {
        return startDate;
    }

    void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    Date getFinishDate() {
        return finishDate;
    }

    void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    String getAddress() {
        return address;
    }

    void setAddress(String address) {
        this.address = address;
    }

    Integer getOrganizer() {
        return organizer;
    }

    void setOrganizer(Integer organizer) {
        this.organizer = organizer;
    }

    Double getPrice() {
        return price;
    }

    void setPrice(Double price) {
        this.price = price;
    }

    Integer getTickets() {
        return tickets;
    }

    void setTickets(Integer tickets) {
        this.tickets = tickets;
    }
}
