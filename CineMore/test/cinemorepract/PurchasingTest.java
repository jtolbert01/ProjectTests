package cinemorepract;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PurchasingTest {
	private Movies movies;
	private Purchasing purchase = new Purchasing();
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
	public void testPrintMoviesVenues() {
		System.out.println("getTestMovieVenues");
		movies = movies.getInstance();
		movieList = movies.getMovies();
		
		purchase.printVenuesMovie(movieList, 0);
		
		
		
	}

}
