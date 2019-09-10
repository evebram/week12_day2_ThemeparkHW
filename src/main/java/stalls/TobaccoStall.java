package stalls;

import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    private int minimumAge;

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
        this.minimumAge = 18;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge() >= minimumAge){
            return true;
        } else{
            return false;
        }
    }
}
