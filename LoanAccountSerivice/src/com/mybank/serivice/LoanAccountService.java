package com.mybank.serivice;

public class LoanAccountService {
	
	private int loanId;
	private int loanAmount;
	private int rateOfInterest;
	private int time;
	public int calculateInterest(int LoanAmount , int RateOfInterest , int Time ) 
	{
		loanAmount = LoanAmount;
		rateOfInterest = RateOfInterest;
		time = Time;
		int SI = (loanAmount*rateOfInterest*time)/100;
		return SI;
		
	}
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public int getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}
	}