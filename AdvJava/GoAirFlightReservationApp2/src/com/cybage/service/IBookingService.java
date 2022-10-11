package com.cybage.service;

import java.util.List;

import com.cybage.model.Booking;
import com.cybage.model.Flight;

public interface IBookingService {
	void searchFlight(String sounce,String destination);
//	List<Booking> getAllFlight();
	void addBooking(Booking booking);
	void deleteBookingById(int booking_id);
}
