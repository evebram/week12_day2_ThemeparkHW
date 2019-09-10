import behaviours.IReviewed;

import java.util.ArrayList;

public class ThemePark{

    private ArrayList<IReviewed> reviewedItems;

    public ThemePark(){
        this.reviewedItems = new ArrayList<>();
    }

    public void addToThemePark(IReviewed name){
        reviewedItems.add(name);
    }

    public ArrayList getAllReviewed(){
        return reviewedItems;
    }
}
