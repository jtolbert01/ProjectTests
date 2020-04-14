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
public class MoviesTest {
    
    public MoviesTest() {
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
     * Test of getMovies method, of class Movies.
     */
    @Test
    public void testGetMovies() {
        System.out.println("getMovies");
        Movies instance = Movies.getInstance();
        ArrayList<Movie> result = instance.getMovies();
    }
    
}
