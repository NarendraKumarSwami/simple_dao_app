package com.sarvagna.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sarvagna.connection.JDBCUtil;
import com.sarvagna.model.Customer;

public class CustomerDaoImp  implements CustomerDao{

	@Override
	public String addCustomer(Customer cs) throws SQLException {
		// TODO Auto-generated method stub
		
		// it will add the customer in database 
		 Connection con = JDBCUtil.getConnection();
		 
		  PreparedStatement p = con.prepareStatement("INSERT INTO customer(id, name, gender) VALUES(?, ?, ?)");
		 
		  p.setInt(1, cs.getCusId());
		  p.setString(2, cs.getName());
		  p.setString(3, cs.getGender());
		  
		  int num =  p.executeUpdate();
		  
		  if(num > 0) {
			    return "Customer is added";
		  }
		
		return "Error is occured while adding customer";
	}

	@Override
	public List<Customer> getAllCustomer() throws SQLException {
		// TODO Auto-generated method stub
		List<Customer> list = new ArrayList<>();
		
		 Connection con = JDBCUtil.getConnection();
		 
		  PreparedStatement p = con.prepareStatement("SELECT * FROM customer");
		  
		   ResultSet result =   p.executeQuery();
		   
		   while(result.next()) {
			     int id =   result.getInt("id");
			     
			     String name = result.getString("name");
			     
			     String gender = result.getString("gender");
			     
			     
			      list.add(new Customer(id, name, gender));
		   }
		
		return list;
	}
	
	

}
