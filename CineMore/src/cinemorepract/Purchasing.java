package cinemorepract;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Purchasing {
	private Scanner keyboard = new Scanner(System.in);
	
	public void purchaseMovieTicket(ArrayList<Movie> searchMovie) {
		System.out.println("Would you like to purchase a ticket? y/n");
		String purchaseYN = keyboard.next();
		keyboard.nextLine();
		//If the user chooses to buy a ticket		  
		if(purchaseYN.equalsIgnoreCase("y")) {
			//User selects movie they would like to see
			System.out.println("Please enter the number of the movie you would like to purchase a ticket to: ");
			int movieChoice = keyboard.nextInt();
			keyboard.nextLine();
			if(movieChoice > searchMovie.size()) {
				System.out.println("Invalid selection");
			} else {
				//User requests to purchase x copies of the tickets
				System.out.println("How many tickets would you like to purchase?");
				int numTickets = keyboard.nextInt();
				keyboard.nextLine();
				for(int x = 1; x <= numTickets; ++x) {
				    printVenuesMovie(searchMovie, movieChoice);
				    System.out.println("Ticket Purchased and Printed");
				}
			}
		//If they do not purchase a ticket	  
		} else {
			System.out.println("No ticket purchased");
		}
		
	}
	public void printVenuesMovie(ArrayList<Movie> searchMovie, int movieChoice) {
		HashMap<Venue,String> map = searchMovie.get(movieChoice - 1).getShowings();
		ArrayList<Venue> theaterList = new ArrayList<Venue>();
		
		for(Venue v : map.keySet()) {
			theaterList.add(v);	
		} 
		for(int y = 0; y < theaterList.size(); ++y) {
			System.out.println((y+1) + "). \n Venue: " + theaterList.get(y).getName());
			System.out.println("Available times: " + map.get(theaterList.get(y)));
		}
		System.out.println("Please enter the number of the venue you would like to attend: ");
		int venueChoice = keyboard.nextInt();
		keyboard.nextLine();
		if(venueChoice > theaterList.size()) {
			System.out.println("Invalid entry");
			return;
		}
		System.out.println("Please enter the time you would like to attend, exactly as you see it: ");
            String timeChoice = keyboard.nextLine();
            System.out.println("Below is the seat map for that theater, if a seat "
                    + "has a 0 it is open. \nEnter the row and column for the seat you'd like on "
                    + "seperate lines.");
            theaterList.get(venueChoice - 1).getMainTheater().printMap();
            int seatRow = keyboard.nextInt();
            keyboard.nextLine();
            int seatCol = keyboard.nextInt();
            keyboard.nextLine();
            Ticket ticket = new Ticket(searchMovie.get(movieChoice - 1).getTitle(),
                                       timeChoice, theaterList.get(venueChoice - 1),
                                       seatRow, seatCol);
            ticket.printTicket();	
		
	}
	//Purchasing play tickets
	public void purchasePlayTicket(ArrayList<Play> searchPlay) {
		System.out.println("Would you like to purchase a ticket? y/n");
		String purchaseYN = keyboard.next();
		keyboard.nextLine();
		//If the user chooses to buy a ticket		  
		if(purchaseYN.equalsIgnoreCase("y")) {
		    //User selects movie they would like to see
			System.out.println("Please enter the number of the play you would like to attend: ");
			int playChoice = keyboard.nextInt();
			keyboard.nextLine();
			if(playChoice > searchPlay.size()) {
	            System.out.println("Invalid selection");
			} else {
				//User requests to purchase x copies of the tickets
				System.out.println("How many tickets would you like to purchase?");
				int numTickets = keyboard.nextInt();
				keyboard.nextLine();
				for(int x = 1; x <= numTickets; ++x) {
                                    printVenuesPlay(searchPlay, playChoice);
				    System.out.println("Ticket Purchased and Printed");
				}
			}
		//If they do not purchase a ticket	  
		} else {
			System.out.println("No ticket purchased");
		}
		
	}
	public void printVenuesPlay(ArrayList<Play> searchPlay, int playChoice) {
		HashMap<Venue,String> map = searchPlay.get(playChoice - 1).getShowings();
		ArrayList<Venue> theaterList = new ArrayList<Venue>();
		
		for(Venue v : map.keySet()) {
			theaterList.add(v);
		}
		for(int y = 0; y < theaterList.size(); ++y) {
			System.out.println((y+1) + "). \n Venue: " + theaterList.get(y).getName());
			System.out.println("Available times: " + map.get(theaterList.get(y)));
		}
		System.out.println("Please enter the number of the venue you would like to attend: ");
		int venueChoice = keyboard.nextInt();
		keyboard.nextLine();
		if(venueChoice > theaterList.size()) {
			System.out.println("Invalid entry");
			return;
		}
		System.out.println("Please enter the time you would like to attend, exactly as you see it: ");
        String timeChoice = keyboard.nextLine();
        System.out.println("Below is the seat map for that theater, if a seat "
                    + "has a 0 it is open. \nEnter the row and column for the seat you'd like on "
                    + "seperate lines.");
            theaterList.get(venueChoice - 1).getMainTheater().printMap();
            int seatRow = keyboard.nextInt();
            keyboard.nextLine();
            int seatCol = keyboard.nextInt();
            keyboard.nextLine();
            Ticket ticket = new Ticket(searchPlay.get(playChoice - 1).getTitle(),
                                       timeChoice, theaterList.get(venueChoice - 1),
                                       seatRow, seatCol);
            ticket.printTicket();
		
		
	}
	//Purchasing Concert Tickets
		public void purchaseConcertTicket(ArrayList<Concert> searchConcert) {
			System.out.println("Would you like to purchase a ticket? y/n");
			String purchaseYN = keyboard.next();
			keyboard.nextLine();
			//If the user chooses to buy a ticket		  
			if(purchaseYN.equalsIgnoreCase("y")) {
				//User selects movie they would like to see
				System.out.println("Please enter the number of the concert you would like to attend: ");
				int concertChoice = keyboard.nextInt();
				keyboard.nextLine();
				if(concertChoice > searchConcert.size()) {
					System.out.println("Invalid selection");
				} else {
					//User requests to purchase x copies of the tickets
					System.out.println("How many tickets would you like to purchase?");
					int numTickets = keyboard.nextInt();
					keyboard.nextLine();
					for(int x = 1; x <= numTickets; ++x) {
					    printVenuesConcert(searchConcert, concertChoice);
					    System.out.println("Ticket Purchased and Printed");
					}
				}
			//If they do not purchase a ticket	  
			} else {
				System.out.println("No ticket purchased");
			}
			
		}
		public void printVenuesConcert(ArrayList<Concert> searchConcert, int concertChoice) {
			HashMap<Venue,String> map = searchConcert.get(concertChoice - 1).getShowings();
			ArrayList<Venue> theaterList = new ArrayList<Venue>();
			
			for(Venue v : map.keySet()) {
				theaterList.add(v);
			}
			for(int y = 0; y < theaterList.size(); ++y) {
				System.out.println((y+1) + "). \n Venue: " + theaterList.get(y).getName());
				System.out.println("Available times: " + map.get(theaterList.get(y)));
			}
			System.out.println("Please enter the number of the venue you would like to attend: ");
			int venueChoice = keyboard.nextInt();
			keyboard.nextLine();
			if(venueChoice > theaterList.size()) {
				System.out.println("Invalid entry");
				return;
			}
			System.out.println("Please enter the time you would like to attend, exactly as you see it: ");
	        String timeChoice = keyboard.nextLine();
                System.out.println("Below is the seat map for that theater, if a seat "
                    + "has a 0 it is open. \nEnter the row and column for the seat you'd like on "
                    + "seperate lines.");
                theaterList.get(venueChoice - 1).getMainTheater().printMap();
                int seatRow = keyboard.nextInt();
                keyboard.nextLine();
                int seatCol = keyboard.nextInt();
                keyboard.nextLine();
                Ticket ticket = new Ticket(searchConcert.get(concertChoice - 1).getTitle(),
                                       timeChoice, theaterList.get(venueChoice - 1),
                                       seatRow, seatCol);
		ticket.printTicket();
			
		}
	

}
