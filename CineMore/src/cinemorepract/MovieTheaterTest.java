package cinemorepract;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MovieTheaterTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	//Tests for MovieTheater class
	@Test 
	public void testTheaterNum() {
		System.out.println("getTheaterNumber");
		MovieTheater instance = new MovieTheater("name", "contact", "addy", 10);
		int expectedResult = 0;
		int result = instance.getTheaterNum();
		assertEquals(expectedResult, result);
	}
	@Test
	public void testAddTheater() {
		System.out.println("addTheater");
		MovieTheater instance = new MovieTheater("name", "contact", "addy", 5);
		int expectedResult = 0;
		instance.addTheater(1, 10, 10);
		int result = instance.getTheaterNum();
		assertEquals(expectedResult, result);
	}
	@Test
	public void testAddTheaterMax() {
		System.out.println("addMaxTheaters");
		MovieTheater instance = new MovieTheater("name", "contact", "addy", 1);
		int expectedResult = 1;
		instance.addTheater(1, 10, 10);
		instance.addTheater(2, 10, 10);
		int result = instance.getTheaterNum();
		assertEquals(expectedResult, result);
	}
	@Test
	public void testGetString() {
		System.out.println("getString");
		MovieTheater instance = new MovieTheater("name", "contact", "addy", 1);
		String expectedResult = "\nName: name\nContact Number: contact\nAddress: addy\nNumber of Theaters: 1";
		String result = instance.toString();
		assertEquals(expectedResult, result);
	}
	@Test
	public void testMaxTheaters() {
		System.out.println("getMaxTheaters");
		MovieTheater instance = new MovieTheater("name", "contact", "addy", 10);
		int expectedResult = 10;
		int result = instance.getMaxTheaters();
		assertEquals(expectedResult, result);
	}
}
