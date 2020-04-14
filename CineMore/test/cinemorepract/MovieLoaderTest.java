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
public class MovieLoaderTest {
    
    public MovieLoaderTest() {
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
     * Test of loadMovies method, of class MovieLoader.
     */
    @Test
    public void testLoadMovies() {
        System.out.println("loadMovies");
        ArrayList<Movie> result = MovieLoader.loadMovies();
    }
    
}
