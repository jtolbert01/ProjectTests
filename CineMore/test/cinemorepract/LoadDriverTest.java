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
public class LoadDriverTest {
    
    public LoadDriverTest() {
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
     * Test of displayMovies method, of class LoadDriver.
     */
    @Test
    public void testDisplayMovies() {
        System.out.println("displayMovies");
        LoadDriver.displayMovies();
    }

    /**
     * Test of displayPlays method, of class LoadDriver.
     */
    @Test
    public void testDisplayPlays() {
        System.out.println("displayPlays");
        LoadDriver.displayPlays();
    }

    /**
     * Test of displayConcerts method, of class LoadDriver.
     */
    @Test
    public void testDisplayConcerts() {
        System.out.println("displayConcerts");
        LoadDriver.displayConcerts();
    }
    
}
