package com.anudip.dao;

import com.anudip.entity.Bank;

public interface BankDao {
	
public int saveCustomer(Bank bank);
	
	public int updateCustomer(Bank bank);
	
	public int deleteCustomer(Bank bank);

}
