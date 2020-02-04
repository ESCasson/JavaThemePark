package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Ride implements ITicketed, ISecurity {

    public RollerCoaster(String name, int rating, double ticketPrice) {
        super(name, rating, ticketPrice);
    }

    @Override
    public double defaultPrice() {
        return getTicketPrice();
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() > 2) {
            return getTicketPrice() * 2;
        }else {return getTicketPrice();}
    }


    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge()>=12 && visitor.getHeight() > 1.45){
            return true;
        } else {return false;}
    }
}
