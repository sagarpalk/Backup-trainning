package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cybage.model.Booking;
import com.cybage.util.JDBCUtility;

public class BookingDaoImpl implements IBookingDao {

	@Override
	public void addBooking(Booking booking) {
		System.out.println("in addbooking");
		Connection connection = JDBCUtility.getConncetion();
		try {

			PreparedStatement preparedStatement = connection.prepareStatement("insert into booking (flight_No, flight_class, status) values(?,?,?);");
			preparedStatement.setInt(1, booking.getFlight_No().getFlight_No());
			preparedStatement.setString(2, booking.getFlight_class());
			preparedStatement.setBoolean(3, booking.isStatus());
			preparedStatement.execute();
			connection.close();
			System.out.println("Ticket Book successfully");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteBookingById(int booking_id) {

	}
}
