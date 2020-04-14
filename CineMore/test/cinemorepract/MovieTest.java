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
public class MovieTest {
    
    public MovieTest() {
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
     * Test of getYear method, of class Movie.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        Movie instance = new Movie("Title", 2018, null, null, 8.3, 100, "R");
        long expResult = 2018;
        long result = instance.getYear();
        assertEquals(expResult, result);
    }

    /**
     * Test of getGenres method, of class Movie.
     */
    @Test
    public void testGetGenres() {
        System.out.println("getGenres");
        String[] gen = {"Comedy", "Horror"};
        Movie instance = new Movie("Title", 2018, gen, null, 8.3, 100, "R");
        String[] expResult = {"Comedy", "Horror"};
        String[] result = instance.getGenres();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getCast method, of class Movie.
     */
    @Test
    public void testGetCast() {
        System.out.println("getCast");
        String[] cast = {"Tim", "Jane"};
        Movie instance = new Movie("Title", 2018, null, cast, 8.3, 100, "R");
        String[] expResult = {"Tim", "Jane"};
        String[] result = instance.getCast();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getRuntime method, of class Movie.
     */
    @Test
    public void testGetRuntime() {
        System.out.println("getRuntime");
        Movie instance = new Movie("Title", 2018, null, null, 8.3, 100, "R");
        long expResult = 100;
        long result = instance.getRuntime();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMPAA method, of class Movie.
     */
    @Test
    public void testGetMPAA() {
        System.out.println("getMPAA");
        Movie instance = new Movie("Title", 2018, null, null, 8.3, 100, "R");
        String expResult = "R";
        String result = instance.getMPAA();
        assertEquals(expResult, result);
    }

    /**
     * Test of genreToString method, of class Movie.
     */
    @Test
    public void testGenreToString() {
        System.out.println("genreToString");
        String[] gen = {"Comedy", "Horror"};
        Movie instance = new Movie("Title", 2018, gen, null, 8.3, 100, "R");
        String expResult = "Comedy, Horror";
        String result = instance.genreToString();
        assertEquals(expResult, result);
    }

    /**
     * Test of castToString method, of class Movie.
     */
    @Test
    public void testCastToString() {
        System.out.println("castToString");
        String[] cast = {"Tim", "Jane"};
        Movie instance = new Movie("Title", 2018, null, cast, 8.3, 100, "R");
        String expResult = "Tim, Jane";
        String result = instance.castToString();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Movie.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String[] gen = {"Comedy", "Horror"};
        String[] cast = {"Tim", "Jane"};
        Movie instance = new Movie("Title", 2018, gen, cast, 8.3, 100, "R");
        String expResult = "Title: Title\n Year: 2018\n Genres: Comedy, Horror\n Cast: "
                + "Tim, Jane\n Rating: 8.3\n Runtime: 100 mins\n MPAA: R";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
