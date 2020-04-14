package cinemorepract;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SearchMoviesTest {
	private SearchMovies search;
	private Movies movies;
	private ArrayList<Movie> movieList;
	
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
		movies = movies.getInstance();
		movieList = movies.getMovies();
		ArrayList<Movie> searchResult = search.returnMovie(movieList,"Aquaman", 12);
		ArrayList<Movie> expectedResult = null;
		assertEquals(expectedResult, searchResult);
	}
	@Test
	public void testSearchTypeTitle() {
		System.out.println("testSearchTypeTitle");
		movies = movies.getInstance();
		movieList = movies.getMovies();
		ArrayList<Movie> searchResult = search.returnMovie(movieList,"Aquaman", 1);
		String result = searchResult.get(0).getTitle();
		String expectedResult = "Aquaman";
		assertEquals(expectedResult, result);
	}
	@Test
	public void testSearchTypeYear() {
		System.out.println("testSearchTypeYear");
		movies = movies.getInstance();
		movieList = movies.getMovies();
		ArrayList<Movie> searchResult = search.returnMovie(movieList,"2018", 2);
		ArrayList<Movie> expectedResult = null;
		assertNotEquals(expectedResult, searchResult);
	}
	@Test
	public void testSearchGenre() {
		System.out.println("testSearchGenre");
		movies = movies.getInstance();
		movieList = movies.getMovies();
		ArrayList<Movie> searchResult = search.returnMovie(movieList,"Drama", 3);
		ArrayList<Movie> expectedResult = null;
		assertNotEquals(expectedResult, searchResult);
	}
	@Test
	public void testSearchRatings() {
		System.out.println("testSearchRatings");
		movies = movies.getInstance();
		movieList = movies.getMovies();
		ArrayList<Movie> searchResult = search.returnMovie(movieList,"6.0", 5);
		ArrayList<Movie> expectedResult = null;
		assertNotEquals(expectedResult, searchResult);
	}
	@Test
	public void testCastSearch() {
		System.out.println("testCastSearch");
		movies = movies.getInstance();
		movieList = movies.getMovies();
		ArrayList<Movie> searchResult = search.returnMovie(movieList, "Clint Eastwood" , 4);
		ArrayList<Movie> expectedResult = null;
		assertNotEquals(expectedResult, searchResult);
	}
	@Test
	public void testRuntimeSearch() {
		System.out.println("testRuntimeSearch");
		movies = movies.getInstance();
		movieList = movies.getMovies();
		ArrayList<Movie> searchResult = search.returnMovie(movieList, "85" , 6);
		int result = searchResult.size();
		int expectedResult = 1;
		assertEquals(expectedResult, result);
	}
	@Test
	public void testMPAASearch() {
		System.out.println("testMPAASearch");
		movies = movies.getInstance();
		movieList = movies.getMovies();
		ArrayList<Movie> searchResult = search.returnMovie(movieList, "R" , 7);
		int result = searchResult.size();
		int expectedResult = 4;
		assertEquals(expectedResult, result);
	}
	@Test
	public void testSortAlpha() {
		System.out.println("testSortAlpha");
		movies = movies.getInstance();
		movieList = movies.getMovies();
		ArrayList<Movie> searchResult = search.returnMovie(movieList, "none" , 8);
		String result = searchResult.get(0).getTitle();
		String expectedResult = "Aquaman";
		assertEquals(expectedResult, result);
	}
	@Test
	public void testSortRatings() {
		System.out.println("testSortRatings");
		movies = movies.getInstance();
		movieList = movies.getMovies();
		ArrayList<Movie> searchResult = search.returnMovie(movieList, "none" , 9);
		double result = searchResult.get(0).getRating();
		double expectedResult = 8.4;
		assertEquals(expectedResult, result, 0);
	}
	@Test
	public void testSortAlphaReverse() {
		System.out.println("testSortAlphaReverse");
		movies = movies.getInstance();
		movieList = movies.getMovies();
		ArrayList<Movie> searchResult = search.returnMovie(movieList, "none" , 10);
		String result = searchResult.get(0).getTitle();
		String expectedResult = "Vice";
		assertEquals(expectedResult, result);
	}
	@Test
	public void testSortRatingsReverse() {
		System.out.println("testSortRatingsReverse");
		movies = movies.getInstance();
		movieList = movies.getMovies();
		ArrayList<Movie> searchResult = search.returnMovie(movieList, "none" , 11);
		double result = searchResult.get(0).getRating();
		double expectedResult = 4.9;
		assertEquals(expectedResult, result, 0);
	}

}
