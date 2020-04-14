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
public class ConcertLoaderTest {
    
    public ConcertLoaderTest() {
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
     * Test of loadConcerts method, of class ConcertLoader.
     */
    @Test
    public void testLoadConcerts() {
        System.out.println("loadConcerts");
        ArrayList<Concert> expResult = null;
        ArrayList<Concert> result = ConcertLoader.loadConcerts();
    }
    
}
