/*
 * Joshua S Tolbert
 */
package cinemorepract;

import org.json.simple.JSONObject;
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
public class AdministratorTest {
    
    public AdministratorTest() {
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
     * Test of toJSON method, of class Administrator.
     */
    @Test
    public void testToJSON() {
        System.out.println("toJSON");
        Administrator instance = new Administrator("Name", "Email", "Password");
        JSONObject expResult = new JSONObject();
        expResult.put("name", "Name");
        expResult.put("email", "Email");
        expResult.put("password", "Password");
        expResult.put("type", "Administrator");
        JSONObject result = instance.toJSON();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Administrator.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Administrator instance = new Administrator("Tim", "tim@email", "password");
        String expResult = "Name: Tim\nAccount Type: Administrator";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
