package org.example2;

public abstract class Rbi {
	private Account account;
	private Customer customer;
	
	double interestRate;
	static final double  maximumInterestRate =4;
	static final int minimumBalanced = 1000;
	static final double maximumWithdraw =50000;
	
	public abstract double getInterestRate();
	public abstract double getWithdraw();
	
	
	
	}
	
	

