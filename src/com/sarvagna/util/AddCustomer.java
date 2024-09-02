package com.sarvagna.util;

import java.sql.SQLException;
import java.util.Scanner;

import com.sarvagna.dao.CustomerDao;
import com.sarvagna.dao.CustomerDaoImp;
import com.sarvagna.model.Customer;

public class AddCustomer {

	
	
	  public static void main(String[] args) {
		  
		  
		   System.out.println("Add a new customer : ");
		   
		   Scanner sc = new Scanner(System.in);
		   
		   System.out.println("Enter the Name ");
		   String name = sc.nextLine();
		   
		   System.out.println("Enter the gender ");
		   String gender = sc.nextLine();
		   
		   System.out.println("customer id :");
		   int id = sc.nextInt();
		   
		   
		   
		   // create a customer object
		   Customer cs = new Customer(id, name, gender);
		   
		   
		   // CustomerDao
		   
		   CustomerDao cDao = new CustomerDaoImp();	
		   
		   try {
		      String result =	cDao.addCustomer(cs);
		      
		      System.out.println(result);
		      
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		   
		   
	  }
}
