package cinemorepract;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PlayTest {

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

	//Tests for Play class
		@Test
		public void testAuthor() {
			System.out.println("getAuthor");
			String[] characters = {"main","side","supporting"};
			Play instance = new Play("title", "author", characters, 2020, 200, 5.0);
			String expectedResult = "author";
			String result = instance.getAuthor();
			assertEquals(expectedResult, result);
		}
		@Test
		public void testCharacters() {
			System.out.println("getCharacters");
			String[] characters = {"main","side","supporting"};
			Play instance = new Play("title", "author", characters, 2020, 200, 5.0);
			String[] expectedResult = {"main","side","supporting"};
			String[] result = instance.getCharacters();
			assertArrayEquals(expectedResult, result);
		}
		@Test
		public void testYear() {
			System.out.println("getYear");
			String[] characters = {"main","side","supporting"};
			Play instance = new Play("title", "author", characters, 2020, 200, 5.0);
			long expectedResult = 2020;
			long result = instance.getYear();
			assertEquals(expectedResult, result);
		}
		@Test
		public void testRuntime() {
			System.out.println("getRuntime");
			String[] characters = {"main","side","supporting"};
			Play instance = new Play("title", "author", characters, 2020, 200, 5.0);
			long expectedResult = 200;
			long result = instance.getRuntime();
			assertEquals(expectedResult, result);
		}
		@Test
		public void testCharToString() {
			System.out.println("getCharToString");
			String[] characters = {"main","side","supporting"};
			Play instance = new Play("title", "author", characters, 2020, 200, 5.0);
			String expectedResult = "main, side, supporting";
			String result = instance.charToString();
			assertEquals(expectedResult, result);
		}
		@Test
		public void testToString() {
			System.out.println("getToString");
			String[] characters = {"main","side","supporting"};
			Play instance = new Play("title", "author", characters, 2020, 200, 5.0);
			String expectedResult = "Title: title\n Author: author\n Characters: main, side, supporting\n Year: 2020\n Runtime: 200 mins\n Rating: 5.0";
			String result = instance.toString();
			assertEquals(expectedResult, result);
		}
}
