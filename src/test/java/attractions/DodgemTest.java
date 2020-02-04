package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor under12;
    Visitor over12;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5, 4.50);
        under12 = new Visitor(10,1.5, 15.0);
        over12 = new Visitor(13,1.5, 15.0);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void hasTicketPrice(){
        assertEquals(4.50, dodgems.defaultPrice(), 2d);
    }

    @Test
    public void canGetSpecialPriceUnder12(){
        assertEquals(2.25, dodgems.priceFor(under12), 2d);
    }
    @Test
    public void canGetSpecialPriceOver12(){
        assertEquals(4.50, dodgems.priceFor(over12), 2d);
    }

    @Test
    public void canAddToVisitCount(){
        dodgems.addToVisitCount();
        assertEquals(1, dodgems.getVisitCount());
    }

}
