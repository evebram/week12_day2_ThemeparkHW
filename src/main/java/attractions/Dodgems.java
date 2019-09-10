package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    private int halfPriceAge;
    private double startingPrice;

    public Dodgems(String name, int rating) {
        super(name, rating);
        this.halfPriceAge = 12;
        this.startingPrice = 4.50;
    }

    public double defaultPrice(){
        return this.startingPrice;
    }

    public double priceFor(Visitor visitor){
        if(visitor.getAge() < halfPriceAge){
            return startingPrice / 2;
        } else{
            return startingPrice;
        }
    }
}
