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
public class AmpitheaterTest {
    
    public AmpitheaterTest() {
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
     * Test of setSeats method, of class Ampitheater.
     */
    @Test
    public void testSetSeats() {
        System.out.println("setSeats");
        int seats = 250;
        Ampitheater instance = new Ampitheater("name", "contact", "add", 25, 10);
        instance.setSeats(seats);
    }

    /**
     * Test of setMap method, of class Ampitheater.
     */
    @Test
    public void testSetMap() {
        System.out.println("setMap");
        Ampitheater instance = new Ampitheater("name", "contact", "add", 20, 20);
        instance.setMap(20, 20);
    }

    /**
     * Test of setTheater method, of class Ampitheater.
     */
    @Test
    public void testSetTheater() {
        System.out.println("setTheater");
        Ampitheater instance = new Ampitheater("name", "contact", "add", 20, 20);
        instance.setTheater(20, 20);
    }

    /**
     * Test of getSeats method, of class Ampitheater.
     */
    @Test
    public void testGetSeats() {
        System.out.println("getSeats");
        Ampitheater instance = new Ampitheater("name", "contact", "add", 20, 20);
        int expResult = 400;
        int result = instance.getSeats();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMap method, of class Ampitheater.
     */
    @Test
    public void testGetMap() {
        System.out.println("getMap");
        int[][] map = new int[20][20];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                map[i][j] = 1;
            }
        }
        Ampitheater instance = new Ampitheater("name", "contact", "add", 20, 20);
        int[][] expResult = new int[20][20];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                expResult[i][j] = 1;
            }
        }
        int[][] result = instance.getMap();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getTheater method, of class Ampitheater.
     */
    @Test
    public void testGetTheater() {
        System.out.println("getTheater");
        Ampitheater instance = new Ampitheater("name", "contact", "add", 20, 20);
        Theater expResult = new Theater(1, 20, 20);
        instance.setTheater(20, 20);
        Theater result = instance.getTheater();
    }

    /**
     * Test of toString method, of class Ampitheater.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Ampitheater instance = new Ampitheater("Theater 1", "555", "125 Street", 20, 20);
        String expResult = "\nName: Theater 1\nContact Number: 555\nAddress: 125 Street\nSeats: 250";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
