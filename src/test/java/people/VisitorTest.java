package people;

import attractions.Attraction;
import attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(14, 1.2, 40.0);
    }

    @Test
    public void hasAge() {
        assertEquals(14, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(1.2, visitor.getHeight(), 0.1);
    }

    @Test
    public void hasMoney() {
        assertEquals(40.0, visitor.getMoney(), 0.1);
    }

    @Test
    public void canCountVisitedAttractions(){
        assertEquals(0, visitor.countVisitedAttractions());
    }

    @Test
    public void canAddAttractionToArray(){
        Park park = new Park("park", 30);
        visitor.addVisitedAttractions(park);
        assertEquals(1, visitor.countVisitedAttractions());
    }
}
