package com.anudip.entity;

public class Bank {
	
	private int custId;
	private String custName;
	private String phone;
	private String balance;
	
	
	
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bank(int custId, String custName, String phone, String balance) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.phone = phone;
		this.balance = balance;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}
	
	
	
	

}
