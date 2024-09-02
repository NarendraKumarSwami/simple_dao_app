package com.sarvagna.dao;

import java.sql.SQLException;
import java.util.List;

import com.sarvagna.model.Customer;

public interface CustomerDao {
	
	 
	public String addCustomer(Customer cs)  throws SQLException;
	
	public List<Customer> getAllCustomer() throws SQLException;

}
