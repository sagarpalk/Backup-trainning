package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cybage.model.Flight;
import com.cybage.util.JDBCUtility;

public class AdminDaoImpl implements IAdminDaoImpl{

	@Override
	public void addFlight(Flight flight) {
		Connection connection=JDBCUtility.getConncetion();
		try {
			
			  PreparedStatement preparedStatement=connection.prepareStatement(" insert into flight values(?,?,?,?,?,?,?,?,?,?,?);");
			  preparedStatement.setInt(1, flight.getFlight_No());
			  preparedStatement.setInt(8, flight.getFlight_total_no_seats());
			  preparedStatement.setInt(9, flight.getFlight_avaliable_seats());
			  preparedStatement.setInt(11, flight.getFlight_price());
			  
			  preparedStatement.setString(2, flight.getFlight_name());
			  preparedStatement.setString(3, flight.getFlight_source());
			  preparedStatement.setString(4, flight.getFlight_destination());
			  preparedStatement.setString(5, flight.getFlight_type());
			  
			  preparedStatement.setTime(6, null);
        	  preparedStatement.setDate(7, flight.getFlight_date());
        	  preparedStatement.setInt(10, 0);
			  preparedStatement.execute();
			  connection.close();
			  System.out.println("flight inserted successfully");
			  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Flight> getAllFlights() {
		Connection connection=JDBCUtility.getConncetion();
		List<Flight> flights=new ArrayList<>();
		
		Flight flight = null;
		   try {
			PreparedStatement preparedStatement=  connection.prepareStatement("select * from flight");
		          
		     ResultSet resultSet=preparedStatement.executeQuery();
		          
		     while(resultSet.next()) {
		        	   int flight_No=  resultSet.getInt(1);
		        	  String flight_name= resultSet.getString(2);
		              int flight_price=   resultSet.getInt(11);
		             
		              flight=new Flight(flight_No, flight_name, flight_price);
		            		  flights.add(flight);
		             
		              
		     }
		              connection.close();
		              return flights;
		            
		   } catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public void updateFlightById(int flight_No) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteFlightById(int flight_No) {
		Connection connection=JDBCUtility.getConncetion();
		try {
			
			  PreparedStatement preparedStatement=connection.prepareStatement(" DELETE FROM flight WHERE flight_No=(?);");
			  preparedStatement.setInt(1, flight_No);
			  
			  preparedStatement.execute();
			  connection.close();
			  System.out.println("flight deleted successfully");
			  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	}

}
