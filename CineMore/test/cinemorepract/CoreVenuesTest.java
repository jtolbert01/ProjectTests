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
public class CoreVenuesTest {
    
    public CoreVenuesTest() {
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
     * Test of loadVenues method, of class CoreVenues.
     */
    @Test
    public void testLoadVenues() {
        System.out.println("loadVenues");
        ArrayList<Venue> expResult = new ArrayList();
        String[] names = {"Cinema18", "Regal IMAX", "Hollywood 20"};
        String[] numbers = {"555-555-5555", "555-555-5551", "555-555-5552"};
        String[] addresses = {"123 Some Road, City, State, 11111",
                              "124 Some Street, City, State, 11112",
                              "125 Some Circle, City, State, 11113"};
        int[] theaters = {7, 10, 8};
        MovieTheater mT = new MovieTheater(names[0], numbers[0], addresses[0],
                                           theaters[0]);
        MovieTheater mT1 = new MovieTheater(names[1], numbers[1], addresses[1],
                                           theaters[1]);
        Ampitheater mT2 = new Ampitheater(names[2], numbers[2], addresses[2],
                                          70, 50);
        addTheater(mT, 25, 10);
        addTheater(mT, 20, 10);
        addTheater(mT1, 25, 10);
        addTheater(mT1, 30, 10);
        expResult.add(mT);
        expResult.add(mT1);
        expResult.add(mT2);
        ArrayList<Venue> result = CoreVenues.loadVenues();
    }

    /**
     * Test of addTheater method, of class CoreVenues.
     */
    @Test
    public void testAddTheater() {
        System.out.println("addTheater");
        MovieTheater mT = new MovieTheater("Name", "555", "123 Some Street", 10);
        int rows = 16;
        int cols = 20;
        CoreVenues.addTheater(mT, rows, cols);
    }

    /**
     * Test of getTheater method, of class CoreVenues.
     */
    @Test
    public void testGetTheater() {
        System.out.println("getTheater");
        int rows = 16;
        int cols = 20;
        int[][] expResult = new int[16][20];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                expResult[i][j] = 0;
            }
        }
        int[][] result = CoreVenues.getTheater(rows, cols);
        assertArrayEquals(expResult, result);
    }
    
    public static void addTheater(MovieTheater mT, int rows, int cols) {
        int[][] tempMap = getTheater(rows, cols);
        int num = mT.getTheaterNum();
        mT.addTheater(num, rows, cols);
    }
    
    public static int[][] getTheater(int rows, int cols) {
        int[][] tempMap = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                tempMap[i][j] = 0;
            }
        }
        return tempMap;
    }
    
}
