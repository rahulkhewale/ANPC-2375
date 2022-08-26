package org.example2;

public abstract class Icici extends Rbi{
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public double getInterestRate() {
		
		return interestRate;
		
	}
	
	public double getWithdrawLimit() {
		
		return maximumWithdraw;
	}
	

}
