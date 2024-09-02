package com.sarvagna.util;

import java.sql.SQLException;
import java.util.List;

import com.sarvagna.dao.CustomerDao;
import com.sarvagna.dao.CustomerDaoImp;
import com.sarvagna.model.Customer;

public class GetAllCustomer {

	
	public static void main(String[] args) {
		
		
		  System.out.println("Following the list of all customers");
		  
		  
		  // Dao layer
		  
		  CustomerDao cDao = new CustomerDaoImp();
		  
		  try {
		    List<Customer> customers =	cDao.getAllCustomer();
		    
		      customers.forEach(System.out::println);
		      
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
