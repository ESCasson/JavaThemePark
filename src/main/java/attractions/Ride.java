package attractions;



public abstract class Ride extends Attraction {
    private double ticketPrice;


    public Ride(String name, int rating, double ticketPrice) {
        super(name, rating);
        this.ticketPrice = ticketPrice;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }
}
