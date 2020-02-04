package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor under2m;
    Visitor over2m;
    Visitor over13Under145m;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10, 8.40);
        under2m = new Visitor(13,1.9, 15.0);
        over2m = new Visitor(11,2.1, 15.0);
        over13Under145m = new Visitor(13,1.45, 15.0);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canGetTicketPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(), 2d);
    }

    @Test
    public void canGetSpecialunder2m(){
        assertEquals(8.4, rollerCoaster.priceFor(under2m), 2d);
    }
    @Test
    public void canGetSpecialPriceOver2m(){
        assertEquals(16.8, rollerCoaster.priceFor(over2m), 2d);
    }
    @Test
    public void canVist(){
        assertEquals(true, rollerCoaster.isAllowedTo(under2m));
    }
    @Test
    public void cantVisitUnder12(){
        assertEquals(false, rollerCoaster.isAllowedTo(over2m));
    }
    @Test
    public void cantVisitUnder145cm(){
        assertEquals(false, rollerCoaster.isAllowedTo(over13Under145m));
    }

    @Test
    public void canAddToVisitCount(){
        rollerCoaster.addToVisitCount();
        assertEquals(1, rollerCoaster.getVisitCount());
    }

}
