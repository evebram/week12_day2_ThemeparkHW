package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;
    Visitor visitor5;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(24, 201, 35.5);
        visitor2 = new Visitor(15, 140, 35.5);
        visitor3 = new Visitor(11, 150, 35.5);
        visitor4 = new Visitor(10, 120, 35.5);
        visitor5 = new Visitor(24, 190, 35.5);

    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void isAllowedToTrueTrue(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void isAllowedToTrueFalse(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void isAllowedToFalseTrue(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor3));
    }

    @Test
    public void isAllowedToFalseFalse(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor4));
    }

    @Test
    public void getDefaultPrice(){
        assertEquals(8.40, 0.01, rollerCoaster.defaultPrice());
    }

    @Test
    public void payDoublePrice(){
        assertEquals(16.80, 0.01, rollerCoaster.priceFor(visitor1));
    }

    @Test
    public void payDefaultPrice(){
        assertEquals(8.40, 0.01, rollerCoaster.priceFor(visitor5));
    }

}
