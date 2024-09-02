package com.sarvagna.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
	
	 
	public static Connection con;
	
	public static Connection getConnection() throws SQLException {
		
		
		if(con == null) {
			 con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/app", "pdbadmin", "root");
		}
		   
		   return con;
	}

}
