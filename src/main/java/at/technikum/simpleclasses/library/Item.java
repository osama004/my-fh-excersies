package at.technikum.simpleclasses.library;

public abstract class Item {

    private String id;

    private Member rentedBy;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Member getRentedBy() {
        return rentedBy;
    }

    public void setRentedBy(Member rentedBy) {
        this.rentedBy = rentedBy;
    }

    public Item(String id) {
        this.id = id;
    }

    public Item(String id, Member rentedBy) {
        this.id = id;
        this.rentedBy = rentedBy;
    }

    public Availability getStatus() {
        if (rentedBy == null) return Availability.FREE;
        return Availability.Rented;
    }
}
