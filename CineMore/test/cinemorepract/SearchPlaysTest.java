package cinemorepract;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SearchPlaysTest {
	private SearchPlays search;
	private Plays plays;
	private ArrayList<Play> playList;
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
	public void testNoSearchTypeFound() {
		System.out.println("testNoSearchTypeFound");
		plays = plays.getInstance();
		playList = plays.getPlays();
		ArrayList<Play> searchResult = search.returnPlay(playList,"none", 11);
		ArrayList<Play> expectedResult = null;
		assertEquals(expectedResult, searchResult);
	}
	@Test
	public void testSearchTypeTitle() {
		System.out.println("testSearchTypeTitle");
		plays = plays.getInstance();
		playList = plays.getPlays();
		ArrayList<Play> searchResult = search.returnPlay(playList,"Hamilton", 1);
		String result = searchResult.get(0).getTitle();
		String expectedResult = "Hamilton";
		assertEquals(expectedResult, result);
	}
	@Test
	public void testSearchTypeYear() {
		System.out.println("testSearchTypeYear");
		plays = plays.getInstance();
		playList = plays.getPlays();
		ArrayList<Play> searchResult = search.returnPlay(playList,"2015", 2);
		int result = searchResult.size();
		int expectedResult = 1;
		assertEquals(expectedResult, result);
	}
	@Test
	public void testSearchTypeCharacter() {
		System.out.println("testSearchTypeCharacter");
		plays = plays.getInstance();
		playList = plays.getPlays();
		ArrayList<Play> searchResult = search.returnPlay(playList,"Kevin 1", 3);
		int result = searchResult.size();
		int expectedResult = 1;
		assertEquals(expectedResult, result);
	}
	@Test
	public void testSearchTypeRating() {
		System.out.println("testSearchTypeRating");
		plays = plays.getInstance();
		playList = plays.getPlays();
		ArrayList<Play> searchResult = search.returnPlay(playList,"5.0", 4);
		int result = searchResult.size();
		int expectedResult = 5;
		assertEquals(expectedResult, result);
	}
	@Test
	public void testSearchTypeRuntime() {
		System.out.println("testSearchTypeRuntime");
		plays = plays.getInstance();
		playList = plays.getPlays();
		ArrayList<Play> searchResult = search.returnPlay(playList,"150", 5);
		int result = searchResult.size();
		int expectedResult = 3;
		assertEquals(expectedResult, result);
	}
	@Test
	public void testSearchTypeAuthor() {
		System.out.println("testSearchTypeAuthor");
		plays = plays.getInstance();
		playList = plays.getPlays();
		ArrayList<Play> searchResult = search.returnPlay(playList,"Matt Stone", 6);
		int result = searchResult.size();
		int expectedResult = 1;
		assertEquals(expectedResult, result);
	}
	@Test
	public void testSortAlpha() {
		System.out.println("testSortAlpha");
		plays = plays.getInstance();
		playList = plays.getPlays();
		ArrayList<Play> searchResult = search.returnPlay(playList,"none", 7);
		String result = searchResult.get(0).getTitle();
		String expectedResult = "Come From Away";
		assertEquals(expectedResult, result);
	}
	@Test
	public void testSortRatings() {
		System.out.println("testSortRatings");
		plays = plays.getInstance();
		playList = plays.getPlays();
		ArrayList<Play> searchResult = search.returnPlay(playList,"none", 8);
		double result = searchResult.get(0).getRating();
		double expectedResult = 9.1;
		assertEquals(expectedResult, result, 0);
	}
	@Test
	public void testSortAlphaReverse() {
		System.out.println("testSortAlphaReverse");
		plays = plays.getInstance();
		playList = plays.getPlays();
		ArrayList<Play> searchResult = search.returnPlay(playList,"none", 9);
		String result = searchResult.get(0).getTitle();
		String expectedResult = "Wicked";
		assertEquals(expectedResult, result);
	}
	@Test
	public void testSortRatingsReverse() {
		System.out.println("testSortRatingsReverse");
		plays = plays.getInstance();
		playList = plays.getPlays();
		ArrayList<Play> searchResult = search.returnPlay(playList,"none", 10);
		double result = searchResult.get(0).getRating();
		double expectedResult = 7.8;
		assertEquals(expectedResult, result, 0);
	}
}
