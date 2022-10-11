package com.cybage.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtility {
	private static Connection connection=null;
	 public static Connection getConncetion() {
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
	  	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinebooking","root", "root");
	
	}catch(Exception e)
	{
		
	System.out.println(e);

	}
	return connection;
	 }

}
