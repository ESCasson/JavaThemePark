package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Ride implements ITicketed {

    public Dodgems(String name, int rating, double ticketPrice) {
        super(name, rating, ticketPrice);
    }

    @Override
    public double defaultPrice() {
        return getTicketPrice() ;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getAge() < 12){
            return defaultPrice()/2;
        }else {return defaultPrice();}
    }
}
