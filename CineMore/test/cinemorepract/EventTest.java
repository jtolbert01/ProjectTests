/*
 * Joshua S Tolbert
 */
package cinemorepract;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author josht
 */
public class EventTest {
    
    public EventTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setTitle method, of class Event.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "EventTitle";
        Event instance = new EventImpl();
        instance.setTitle(title);
    }

    /**
     * Test of setRating method, of class Event.
     */
    @Test
    public void testSetRating() {
        System.out.println("setRating");
        double rating = 6.7;
        Event instance = new EventImpl();
        instance.setRating(rating);
    }

    /**
     * Test of setEventType method, of class Event.
     */
    @Test
    public void testSetEventType() {
        System.out.println("setEventType");
        String eventType = "Movie";
        Event instance = new EventImpl();
        instance.setEventType(eventType);
    }

    /**
     * Test of getTitle method, of class Event.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Event instance = new EventImpl();
        instance.setTitle("MovieTitle");
        String expResult = "MovieTitle";
        String result = instance.getTitle();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRating method, of class Event.
     */
    @Test
    public void testGetRating() {
        System.out.println("getRating");
        Event instance = new EventImpl();
        instance.setRating(5.1);
        double expResult = 5.1;
        double result = instance.getRating();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getEventType method, of class Event.
     */
    @Test
    public void testGetEventType() {
        System.out.println("getEventType");
        Event instance = new EventImpl();
        instance.setEventType("Movie");
        String expResult = "Movie";
        String result = instance.getEventType();
        assertEquals(expResult, result);
    }

    public class EventImpl extends Event {
    }
    
}
