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
public class DataWriterTest {
    
    public DataWriterTest() {
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
     * Test of saveAccount method, of class DataWriter.
     */
    @Test
    public void testSaveAccount() {
        System.out.println("saveAccount");
        JSONObject acct = new JSONObject();
        DataWriter.saveAccount(acct);
    }
    
}
