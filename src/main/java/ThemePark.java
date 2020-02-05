
import attractions.Attraction;
import attractions.Playground;
import attractions.RollerCoaster;
import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;
import stalls.TobaccoStall;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;

public class ThemePark {
    private ArrayList<IReviewed> areas;
    private HashMap allReviews;
    private ArrayList<IReviewed> allowedAreas;

    public ThemePark() {
        this.areas = new ArrayList<>();
        this.allReviews = new HashMap();
        this.allowedAreas = new ArrayList<>();
    }

    public void populateAllReviews() {
        for (IReviewed area : areas) {
            String name = area.getName();
            int rating = area.getRating();
            this.allReviews.put(name, rating);
        }
    }

    public void addAreas(IReviewed attraction) {
        areas.add(attraction);
    }

    public ArrayList<IReviewed> getAreas() {
        return areas;
    }

    public HashMap getAllReviews() {
        return allReviews;
    }

    public int countAreas() {
        return areas.size();
    }

    public void visit(Visitor visitor, Attraction attraction) {
        visitor.addVisitedAttractions(attraction);
        attraction.addToVisitCount();
    }

    public void getVisitorCanVisit(Visitor visitor) {
        for (IReviewed area : areas) {
            if (area instanceof ISecurity) {
                if (((ISecurity) area).isAllowedTo(visitor)) {
                    allowedAreas.add(area);
                }
            } else {
                allowedAreas.add(area);
            }
        }
    }

    public ArrayList<IReviewed> getAllowedAreas() {
        return allowedAreas;
    }
}



