package com.cybage.app.utilities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class JDBCconnectivity {
	private static Connection connection=null;
	private static JDBCconnectivity jdbc=null;
	private JDBCconnectivity() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/flight_project","root","root");
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public static Connection getConnection() 
	{
		jdbc=new JDBCconnectivity();
		System.out.println(connection);
		return connection;
	}
	
	 public static void printSQLException(SQLException ex) {
	        for (Throwable e: ex) {
	            if (e instanceof SQLException) {
	                e.printStackTrace(System.err);
	                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
	                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
	                System.err.println("Message: " + e.getMessage());
	                Throwable t = ex.getCause();
	                while (t != null) {
	                    System.out.println("Cause: " + t);
	                    t = t.getCause();
	                }
	            }
	        }
	    }
	
}