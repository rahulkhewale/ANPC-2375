package question1.main;

import java.util.Scanner;

import javax.naming.InvalidNameException;

public class Main {
	public static void main(String [] args) throws InvalidNameException{
		boolean yes= true;
		Scanner sc = new Scanner(System.in);
		String[]name = new String[100];
		System.out.println("Enter your name:- ");
			name[0] = sc.nextLine();
			System.out.println("Your Name is"+name[1]);
			System.out.println("Do you want to enter new name'yes or no'"+yes);
			if(yes) {
				for(int i=1;;) {
				i++;
				
			}
			}
			else {
				System.out.println("Thank you");
			}
		
		
		
	
	}
}

