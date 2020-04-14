package cinemorepract;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SearchConcertsTest {
	private SearchConcerts search;
	private Concerts concerts;
	private ArrayList<Concert> concertList;
	
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
		concerts = concerts.getInstance();
		concertList = concerts.getConcerts();
		ArrayList<Concert> searchResult = search.returnConcert(concertList,"JTE Tour", 9);
		ArrayList<Concert> expectedResult = null;
		assertEquals(expectedResult, searchResult);
	}
	@Test
	public void testSearchTypeTitle() {
		System.out.println("testSearchTypeTitle");
		concerts = concerts.getInstance();
		concertList = concerts.getConcerts();
		ArrayList<Concert> searchResult = search.returnConcert(concertList,"JTE Tour", 1);
		String result = searchResult.get(0).getTitle();
		String expectedResult = "JTE Tour";
		assertEquals(expectedResult, result);
	}
	@Test
	public void testSearchTypeHeadliner() {
		System.out.println("testSearchTypeTitle");
		concerts = concerts.getInstance();
		concertList = concerts.getConcerts();
		ArrayList<Concert> searchResult = search.returnConcert(concertList,"Bon Jovi", 2);
		ArrayList<Concert> expectedResult = null;
		assertEquals(expectedResult, searchResult);
	}
	@Test
	public void testSearchBands() {
		System.out.println("testSearchBands");
		concerts = concerts.getInstance();
		concertList = concerts.getConcerts();
		ArrayList<Concert> searchResult = search.returnConcert(concertList,"Fall Out Boy", 3);
		ArrayList<Concert> expectedResult = null;
		assertNotEquals(expectedResult, searchResult);
	}
	@Test
	public void testSearchRatings() {
		System.out.println("testSearchRatings");
		concerts = concerts.getInstance();
		concertList = concerts.getConcerts();
		ArrayList<Concert> searchResult = search.returnConcert(concertList,"6.0", 4);
		ArrayList<Concert> expectedResult = null;
		assertNotEquals(expectedResult, searchResult);
	}
	@Test
	public void testSortAlpha() {
		System.out.println("testSortAlpha");
		concerts = concerts.getInstance();
		concertList = concerts.getConcerts();
		ArrayList<Concert> searchResult = search.returnConcert(concertList, "none" , 5);
		String result = searchResult.get(0).getTitle();
		String expectedResult = "Decibal Magazine Tour";
		assertEquals(expectedResult, result);
	}
	@Test
	public void testSortRatings() {
		System.out.println("testSortRatings");
		concerts = concerts.getInstance();
		concertList = concerts.getConcerts();
		ArrayList<Concert> searchResult = search.returnConcert(concertList, "none" , 6);
		double result = searchResult.get(0).getRating();
		double expectedResult = 9.0;
		assertEquals(expectedResult, result, 0);
	}
	@Test
	public void testSortAlphaReverse() {
		System.out.println("testSortAlphaReverse");
		concerts = concerts.getInstance();
		concertList = concerts.getConcerts();
		ArrayList<Concert> searchResult = search.returnConcert(concertList, "none" , 7);
		String result = searchResult.get(0).getTitle();
		String expectedResult = "Where the Light Is";
		assertEquals(expectedResult, result);
	}
	@Test
	public void testSortRatingsReverse() {
		System.out.println("testSortRatingsReverse");
		concerts = concerts.getInstance();
		concertList = concerts.getConcerts();
		ArrayList<Concert> searchResult = search.returnConcert(concertList, "none" , 8);
		double result = searchResult.get(0).getRating();
		double expectedResult = 7.2;
		assertEquals(expectedResult, result, 0);
	}
}
