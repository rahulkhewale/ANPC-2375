package com.mybank.view;
import com.mybank.serivice.LoanAccountService;

public class MainView {
	public static void main(String[] args) {
	LoanAccountService interest1 = new LoanAccountService();
	int Interest = interest1.calculateInterest(1000, 6, 6 );
	System.out.println("Interest for loan" + interest1.getLoanId()+ "is" + Interest);
		
	}
}
