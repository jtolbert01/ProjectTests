package cinemorepract;
import java.util.ArrayList;

/*
 * Search Function
 */

public class SearchConcerts {
	public static Sort sort = new Sort();
	
	//Function to delegate type of search and return the query
	public static ArrayList<Concert> returnConcert(ArrayList<Concert> concertList, String target, int searchType) {
		switch(searchType) {
		case 1: 
			if(titleSearchConcerts(concertList, target) != null) {
				return titleSearchConcerts(concertList, target);
			}
		break;
		case 2: 
			if(headlinerSearch(concertList, target) != null) {
				return headlinerSearch(concertList, target);
			}
			break;
		case 3: 
			if(bandsSearch(concertList, target) != null) {
				return bandsSearch(concertList, target);
			}
			break;
		case 4: 
			if(ratingSearch(concertList, target) != null) {
				return ratingSearch(concertList, target);
			}
			break;
		//Sort Functions Below
		case 5:
			return sort.sortAlphaConcert(concertList);
		case 6:
			return sort.sortRatingConcert(concertList);
		case 7:
			ArrayList<Concert> alphaArray = sort.sortAlphaConcert(concertList);
			ArrayList<Concert> returnArray = new ArrayList<Concert>();
			for(int i = alphaArray.size() - 1; i >= 0; --i) {
				returnArray.add(alphaArray.get(i));
			}
			return returnArray;
		case 8:
			ArrayList<Concert> ratingArray = sort.sortRatingConcert(concertList);
			ArrayList<Concert> reverseArray = new ArrayList<Concert>();
			for(int i = ratingArray.size() - 1; i >= 0; --i) {
				reverseArray.add(ratingArray.get(i));
			}
			return reverseArray;
		default:
			return null;
		}
		
		return null;
		
	}
	
	//Search's Concerts to find all Concerts above a certain rating
	public static ArrayList<Concert> ratingSearch(ArrayList<Concert> ConcertList, String rating) {
		
		ArrayList<Concert> returnArray = new ArrayList<Concert>();
		for (Concert m : ConcertList) {
			
			double currentRating = m.getRating();
			double targetRating = Double.parseDouble(rating);
			
			if(currentRating >= targetRating) {
				returnArray.add(m);
			}
		}
		
		if(returnArray.size() != 0) {
			return returnArray;
		}
		return null;
	}

	//Search's for all Concerts of a given genre
	public static ArrayList<Concert> bandsSearch(ArrayList<Concert> concertList, String bands) {
		
		ArrayList<Concert> returnArray = new ArrayList<Concert>();
		for (Concert m : concertList) {
			
			String[] currentBand = m.getBands();
			
			
			for(int i = 0; i < currentBand.length; ++i) {
				if(currentBand[i].compareTo(bands) == 0) {
					returnArray.add(m);
				}
			}
		}
		
		if(returnArray.size() != 0) {
			return returnArray;
		}
		return null;
	}
	
	//Search's for all Concerts from a certain year
	public static ArrayList<Concert> headlinerSearch(ArrayList<Concert> concertList, String headliner) {
		
		ArrayList<Concert> returnArray = new ArrayList<Concert>();
		for (Concert m : concertList) {
			
			String currentHead = m.getHeadliner();
			
			if(currentHead == headliner) {
				returnArray.add(m);
			}
		}
		
		if(returnArray.size() != 0) {
			return returnArray;
		}
		return null;
	}
	
	//Search's for the title of the Concert, should be able to make generic
	public static ArrayList<Concert> titleSearchConcerts(ArrayList<Concert> concertList, String title) {
		
		ArrayList<Concert> returnArray = new ArrayList<Concert>();
		for (Concert m : concertList) {
			String currentTitle = m.getTitle();

			if(currentTitle.compareTo(title) == 0) {
				returnArray.add(m);
			}
		}
		if(returnArray.size() != 0) {
			return returnArray;
		}
		return null;
	}

}