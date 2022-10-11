package utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtility {
	private static Connection connection=null;
	 public static Connection getConncetion() {
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
	  	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root", "root");
	  	System.out.println("Connection to mysql Database is succesfull....!!");
	}catch(Exception e)
	{
	e.printStackTrace();
	}
	return connection;
	 }

}
