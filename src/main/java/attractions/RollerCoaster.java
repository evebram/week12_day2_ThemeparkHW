package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ISecurity, ITicketed {

    private int minAge;
    private int minHeight;
    private double startingPrice;
    private int doublePriceHeight;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
        this.minAge = 12;
        this.minHeight = 145;
        this.doublePriceHeight = 200;
        this.startingPrice = 8.40;
    }

    public boolean isAllowedTo(Visitor visitor){
        if((visitor.getAge() >= minAge) && (visitor.getHeight() >= minHeight)){
            return true;
        } else{
            return false;
        }
    }

    public double defaultPrice(){
        return this.startingPrice;
    }

    public double priceFor(Visitor visitor){
        if(visitor.getHeight() > doublePriceHeight){
            return startingPrice * 2;
        } else{
            return startingPrice;
        }
    }

}
