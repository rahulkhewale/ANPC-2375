

package question2.model;

import java.util.Scanner;

public class MovieTheater {
	
	public String movieName;
	double movieStartTime;
	double movieEndTime;
	double movieTicketPrice;
	
	Scanner sc = new Scanner(System.in);
	public void addMovie(String movieName, double movieStartTime, double movieEndTime, double movieTicketPrice) {
		System.out.println("Enter your movie name: ");
		movieName = sc.nextLine();
		}
	
	public void detailsOfMovie() {
		System.out.println("Name of Movie is"+movieName);
		System.out.println("movie Start time is"+movieStartTime);
		System.out.println("movie End time is"+movieEndTime);
		System.out.println("Ticket Price is"+movieTicketPrice);
	}

}
