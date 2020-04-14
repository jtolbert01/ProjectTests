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
public class ConcertTest {
    
    public ConcertTest() {
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
     * Test of getHeadliner method, of class Concert.
     */
    @Test
    public void testGetHeadliner() {
        System.out.println("getHeadliner");
        String[] bands = {"Band 1", "Band 2"};
        Concert instance = new Concert("Title", "Headliner", bands, 8.7);
        String expResult = "Headliner";
        String result = instance.getHeadliner();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBands method, of class Concert.
     */
    @Test
    public void testGetBands() {
        System.out.println("getBands");
        String[] bands = {"Band 1", "Band 2"};
        Concert instance = new Concert("Title", "Headliner", bands, 8.7);
        String[] expResult = {"Band 1", "Band 2"};
        String[] result = instance.getBands();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of bandsToString method, of class Concert.
     */
    @Test
    public void testBandsToString() {
        System.out.println("bandsToString");
        String[] bands = {"Band 1", "Band 2"};
        Concert instance = new Concert("Title", "Headliner", bands, 8.7);
        String expResult = "Band 1, Band 2";
        String result = instance.bandsToString();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Concert.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String[] bands = {"Band 1", "Band 2"};
        Concert instance = new Concert("Title", "Headliner", bands, 8.7);
        String expResult = "Title: Title\n Headliner: Headliner\n Bands: Band 1, "
                + "Band 2\n Rating: 8.7";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
