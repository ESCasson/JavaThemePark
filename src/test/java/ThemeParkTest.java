
import attractions.Attraction;
import attractions.Park;
import attractions.RollerCoaster;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.Stall;





import static org.junit.Assert.assertEquals;

public class ThemeParkTest {
    ThemePark themePark;
    Visitor visitor;
    Attraction attraction;
    Stall stall;
    Attraction attraction2;
    Stall stall1;

    @Before
    public void before(){
        themePark = new ThemePark();
        visitor = new Visitor(12,3,14);
        attraction = new RollerCoaster("Big Roller", 30, 8.5);
        stall = new IceCreamStall("Icey Nicey", "Mr Freeze", ParkingSpot.A2, 50);
        attraction2 = new Park("Greeny McGreeny", 55);

    }

    @Test
    public void canAddCountToAttractionAndAttactionToVisitorwithVisitMethod(){
        themePark.visit(visitor, attraction);
        assertEquals(1, visitor.countVisitedAttractions());
        assertEquals(1, attraction.getVisitCount());
    }

    @Test
    public void canPopulateHashMap(){
        themePark.addAreas(attraction);
        themePark.addAreas(stall);
        themePark.addAreas(attraction2);
        themePark.populateAllReviews();
    }

    @Test
    public void canCountAreas(){
        assertEquals(0, themePark.countAreas());
    }


    @Test
    public void canAddAreas(){
        themePark.addAreas(attraction);
        assertEquals(1, themePark.countAreas());
    }

    @Test
    public void canGetAreas(){
        themePark.addAreas(attraction);
        String result = themePark.getAreas().get(0).getName();
        assertEquals("Big Roller",result);

    }





}
