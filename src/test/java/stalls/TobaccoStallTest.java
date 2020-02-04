package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor vistor1;
    Visitor vistor2;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 30);
        vistor1 = new Visitor(14, 2, 15);
        vistor2 = new Visitor(19,2,12);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void canVisitorCanVisit(){
        assertEquals(true, tobaccoStall.isAllowedTo(vistor2));
    }

    @Test
    public void canVisitorCantVisit(){
        assertEquals(false, tobaccoStall.isAllowedTo(vistor1));
    }
}
