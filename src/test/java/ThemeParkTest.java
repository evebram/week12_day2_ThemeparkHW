import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
import attractions.RollerCoaster;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;

    IReviewed dodgem;
    IReviewed park;
    IReviewed playground;
    IReviewed rollercoaster;
    IReviewed candyflossStall;
    IReviewed iceCreamStall;
    IReviewed tobaccoStall;

    @Before
    public void setUp(){
        themePark = new ThemePark();

        dodgem = new Dodgems("Bumpers", 8);
        park = new Park("Green Park", 6);
        playground = new Playground("Soft Play", 7);
        rollercoaster = new RollerCoaster("Hurdey-Gurdey", 9);
        candyflossStall = new CandyflossStall("Candy Land", "Cherrie", ParkingSpot.A1, 7);
        iceCreamStall = new IceCreamStall("Icy Bites", "Sven", ParkingSpot.A4, 8);
        tobaccoStall = new TobaccoStall("Smokey Joes", "Joe", ParkingSpot.B1, 4);

        themePark.addToThemePark(dodgem);
        themePark.addToThemePark(park);
        themePark.addToThemePark(playground);
        themePark.addToThemePark(rollercoaster);
        themePark.addToThemePark(candyflossStall);
        themePark.addToThemePark(iceCreamStall);
        themePark.addToThemePark(tobaccoStall);
    }

    @Test
    public void returnAllReviewed(){
        assertArrayEquals(reviewedItems<>, t hemePark.getAllReviewed());
    }
}
