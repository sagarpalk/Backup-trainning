package com.cybage.dao;

import com.cybage.model.Booking;

public interface IBookingDaoImpl {
	//void searchFlight(String sounce,String destination);

	void addBooking(Booking booking_id);
	void deleteBookingById(int booking_id);
}
