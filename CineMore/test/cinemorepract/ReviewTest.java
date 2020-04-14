package cinemorepract;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ReviewTest {

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

	@Test
	public void testDefaultReviewStar() {
		System.out.println("testDefaultReview");
		Review review = new Review();
		int expectedResult = 1;
		int result = review.getStarRating();
		assertEquals(expectedResult, result);
	}
	@Test
	public void testDefaultReview() {
		System.out.println("testDefaultReviewWritten");
		Review review = new Review();
		String expectedResult = "No Review Available";
		String result = review.getWrittenReview();
		assertEquals(expectedResult, result);
	}
	@Test
	public void testReviewStar() {
		System.out.println("testStarReview");
		Review review = new Review(5);
		int expectedResult = 5;
		int result = review.getStarRating();
		assertEquals(expectedResult, result);
	}
	@Test
	public void testReviewStarWritten() {
		System.out.println("testStarReviewWritten");
		Review review = new Review(5);
		String expectedResult = "No written review left";
		String result = review.getWrittenReview();
		assertEquals(expectedResult, result);
	}
	@Test
	public void testReviewWritten() {
		System.out.println("testReviewWritten");
		Review review = new Review(5,"Amazing");
		String expectedResult = "Amazing";
		String result = review.getWrittenReview();
		assertEquals(expectedResult, result);
	}
	@Test
	public void testReviewToString() {
		System.out.println("testReviewToString");
		Review review = new Review(5,"Amazing");
		String expectedResult = "**********\n Star Rating: 5\nWritten Review: Amazing";
		String result = review.toString();
		assertEquals(expectedResult, result);
	}

}
