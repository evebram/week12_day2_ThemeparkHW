package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor1 = new Visitor(8, 120, 6.9);
        visitor2 = new Visitor(13, 120, 6.9);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void getDefaultPrice(){
        assertEquals(4.50, 0.01, dodgems.defaultPrice());
    }

    @Test
    public void payDoublePrice(){
        assertEquals(2.25, 0.01, dodgems.priceFor(visitor1));
    }

    @Test
    public void payDefaultPrice(){
        assertEquals(4.50, 0.01, dodgems.priceFor(visitor2));
    }
}
