package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class Playground extends Attraction implements ISecurity {

    private int maximumAge;

    public Playground(String name, int rating) {
        super(name, rating);
        this.maximumAge = 15;
    }

    public boolean isAllowedTo(Visitor visitor){
        if(visitor.getAge() <= maximumAge){
            return true;
        }
        else{
            return false;
        }
    }
}

