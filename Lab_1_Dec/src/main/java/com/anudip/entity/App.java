package com.anudip.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anudip.dao.BankDao;
import com.anudip.daoimpl.BankDaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext af = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	BankDaoImpl bankDao=  (BankDaoImpl) af.getBean("bankdao");
    	
    	int result2= bankDao.updateCustomer(new Bank(1,"rahul","98452578","5000"));
    	System.out.println(result2);
    	
    	Bank bank = new Bank();
    	
    	bank.setCustId(1);
    	int result3 = bankDao.deleteCustomer(bank);
    	System.out.println(result3);
    }
}
