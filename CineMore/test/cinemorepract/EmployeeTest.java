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
public class EmployeeTest {
    
    public EmployeeTest() {
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
     * Test of setEmployeeID method, of class Employee.
     */
    @Test
    public void testSetEmployeeID() {
        System.out.println("setEmployeeID");
        long empID = 11234;
        Employee instance = new Employee("Name", "Email", "Password", 11234);
        instance.setEmployeeID(empID);
    }

    /**
     * Test of getEmployeeID method, of class Employee.
     */
    @Test
    public void testGetEmployeeID() {
        System.out.println("getEmployeeID");
        Employee instance = new Employee("Name", "Email", "Password", 11234);
        long expResult = 11234;
        long result = instance.getEmployeeID();
        assertEquals(expResult, result);
    }

    /**
     * Test of toJSON method, of class Employee.
     */
    @Test
    public void testToJSON() {
        System.out.println("toJSON");
        long id = 11234;
        Employee instance = new Employee("Tim", "tim@email", "password", id);
        JSONObject expResult = new JSONObject();
        expResult.put("name", "Tim");
        expResult.put("id", id);
        expResult.put("email", "tim@email");
        expResult.put("password", "password");
        expResult.put("type", "Employee");
        JSONObject result = instance.toJSON();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Employee.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Employee instance = new Employee("Name", "Email", "Password", 11234);
        String expResult = "Name: Name\nAccount Type: Employee";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
