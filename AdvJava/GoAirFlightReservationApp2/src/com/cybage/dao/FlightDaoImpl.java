package com.cybage.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;

import com.cybage.model.Booking;
import com.cybage.model.Flight;
import com.cybage.model.User;
import com.cybage.util.JDBCUtility;

public class FlightDaoImpl implements IFlightDao {

	@Override
	public Flight getFlightById(int flight_No) {
		Connection connection = JDBCUtility.getConncetion();

		Flight flight = null;
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement(" select * from flight where flight_No=?;");
			preparedStatement.setInt(1, flight_No);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				int flight_No1 = resultSet.getInt(1);
				int flight_total_no_seats = resultSet.getInt(8);
				int flight_avaliable_seats = resultSet.getInt(9);
				int flight_price = resultSet.getInt(11);
				String flight_name = resultSet.getString(2);
				String flight_source = resultSet.getString(3);
				String flight_destination = resultSet.getString(4);
				String flight_type = resultSet.getString(5);
				Time flight_time = resultSet.getTime(6);
				Date flight_date = resultSet.getDate(7);

				flight = new Flight(flight_No1, flight_total_no_seats, flight_avaliable_seats, flight_price,
						flight_name, flight_source, flight_destination, flight_type, flight_time, flight_date);

			}
			connection.close();
			return flight;

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;

	}

	@Override
	public Flight getAllBooking(int booking_id) {
		Connection connection = JDBCUtility.getConncetion();

		Flight flight = null;
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("Insert into booking values(?,?,?,?,?,?,?)");
			preparedStatement.setInt(1, booking_id);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int bookingId = resultSet.getInt(1);
				String status = resultSet.getString(2);
				int flight_No1 = resultSet.getInt(3);
				String flight_type = resultSet.getString(4);
				int flight_price = resultSet.getInt(5);
				int userId = resultSet.getInt(6);
				Date flight_date = resultSet.getDate(7);
			//	Booking book = new Booking(bookingId, status, flight_No1, flight_type, flight_price, userId,
				//		flight_date);
			}
			connection.close();
			return flight;

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;

	}

	@Override
	public Flight bookFlight(int flight_No) {
		System.out.println("sagar");
		Connection connection = JDBCUtility.getConncetion();
		System.out.println("sagar");

		Flight flight = null;
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement(" select * from flight where flight_No=?;");
			preparedStatement.setInt(1, flight_No);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				int flight_No1 = resultSet.getInt(1);
				Date flight_date = resultSet.getDate(7);
				Time flight_time = resultSet.getTime(6);
				String flight_type = resultSet.getString(5);
				int flight_price = resultSet.getInt(11);
				int flight_total_no_seats = resultSet.getInt(8);				

				flight = new Flight(flight_No1, flight_total_no_seats, flight_price, flight_type, flight_time, flight_date);
				
			}
			connection.close();
			return flight;

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}

}
