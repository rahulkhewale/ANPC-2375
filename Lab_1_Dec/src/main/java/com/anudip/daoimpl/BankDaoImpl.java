package com.anudip.daoimpl;

import com.anudip.dao.BankDao;
import com.anudip.entity.Bank;
import org.springframework.jdbc.core.JdbcTemplate;

public class BankDaoImpl implements BankDao{
	
private JdbcTemplate jdbcTemplate;
	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveCustomer(Bank bank) {
		String query = "insert into passenger value('"+bank.getCustId()+"','"+bank.getCustName()+"','"+bank.getPhone()+"','"+bank.getBalance()+"')";
		return jdbcTemplate.update(query);
		
	}

	public int updateCustomer(Bank bank) {
		String query= "update passenger set pname = '"+bank.getCustName()+"' where id='"+bank.getCustId()+"'";
		return jdbcTemplate.update(query);
		
	}

	public int deleteCustomer(Bank bank) {
		String query = "delete from passenger where id='"+bank.getCustId()+"'";
		return jdbcTemplate.update(query);
	}

}
