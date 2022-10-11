package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cybage.model.Booking;
import com.cybage.util.JDBCUtility;

public class BookingDaoImpl implements IBookingDaoImpl {

	@Override
	public void addBooking(Booking booking) {
		System.out.println("in addbooking");
		Connection connection = JDBCUtility.getConncetion();
		try {

			PreparedStatement preparedStatement = connection
					.prepareStatement("insert into booking (flight_No, flight_class, status) values(?,?,?);");

//			preparedStatement.setInt(1, booking.getBooking_id());
//			
//			
//			
//			
//			
//			
//			preparedStatement.setBoolean(2, booking.isStatus());
//			preparedStatement.setInt(3, booking.getFlight_No().getFlight_No());
//			preparedStatement.setString(4, booking.getFlight_class());
//
//			preparedStatement.setInt(5, booking.getTicket_price());
//			preparedStatement.setInt(6, booking.getUser_id().getUser_id());
//			preparedStatement.setString(7, booking.getBookingDate());
			
			preparedStatement.setInt(1, booking.getFlight_No().getFlight_No());
			preparedStatement.setString(2, booking.getFlight_class());
			preparedStatement.setBoolean(3, booking.isStatus());
			
			

			preparedStatement.execute();
			connection.close();
			System.out.println("Ticket Book successfully");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteBookingById(int booking_id) {
		// TODO Auto-generated method stub

	}
}
