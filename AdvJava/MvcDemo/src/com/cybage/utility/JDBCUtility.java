package com.cybage.utility;

import java.sql.Connection;
import java.sql.DriverManager;



public class JDBCUtility {
	private static Connection connection=null;
	
	   public static Connection getConnection()
	   {
		
		  
		   try{
			   Class.forName("com.mysql.jdbc.Driver");
			   
			   connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcDemo" ,"root","root");
	          
	            
			   
		   }
		   
		   catch(Exception e)
		   {
			   e.printStackTrace();
		   }
		   return connection;
	   } 
	   

}
