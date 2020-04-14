/*
 * Joshua S Tolbert
 */
package cinemorepract;

import java.util.ArrayList;
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
public class ConcertsTest {
    
    public ConcertsTest() {
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
     * Test of getInstance method, of class Concerts.
     */

    /**
     * Test of getConcerts method, of class Concerts.
     */
    @Test
    public void testGetConcerts() {
        System.out.println("getConcerts");
        Concerts instance = Concerts.getInstance();
        ArrayList<Concert> expResult = ConcertLoader.loadConcerts();
        ArrayList<Concert> result = instance.getConcerts();
    }
    
}
