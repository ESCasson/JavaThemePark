
import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;
import java.util.HashMap;

public class ThemePark {
    private ArrayList<IReviewed> areas;
    private HashMap allReviews;

    public ThemePark() {
        this.areas = new ArrayList<IReviewed>();
        this.allReviews = new HashMap();
    }

    public void populateAllReviews(){
        for( IReviewed area : areas) {
            String name = area.getName();
            int rating = area.getRating();
            this.allReviews.put(name, rating);
        }
    }

    public void addAreas(IReviewed attraction){
        areas.add(attraction);
    }

    public ArrayList<IReviewed> getAreas(){
        return areas;
    }

    public HashMap getAllReviews() {
        return allReviews;
    }

    public int countAreas(){
        return areas.size();
    }

    public void visit(Visitor visitor, Attraction attraction) {
        visitor.addVisitedAttractions(attraction);
        attraction.addToVisitCount();
    }





    }
