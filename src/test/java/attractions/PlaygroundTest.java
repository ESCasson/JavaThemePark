package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor vistor1;
    Visitor vistor2;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        vistor1 = new Visitor(14, 2, 15);
        vistor2 = new Visitor(16,2,12);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void canVisitorCanVisit(){
        assertEquals(true, playground.isAllowedTo(vistor1));
    }

    @Test
    public void canVisitorCantVisit(){
        assertEquals(false, playground.isAllowedTo(vistor2));
    }

    @Test
    public void canAddToVisitCount(){
        playground.addToVisitCount();
        assertEquals(1, playground.getVisitCount());
    }
}
