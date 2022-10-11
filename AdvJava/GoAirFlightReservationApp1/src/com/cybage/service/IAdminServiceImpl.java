package com.cybage.service;

import java.util.List;

import com.cybage.model.Flight;

public interface IAdminServiceImpl {
	void addFlight(Flight flight);
	List<Flight> getAllFlight();
	void updateFlightById(int flight_No);
	void deleteFlightById(int flight_No);
//	List<Booking> getAllBooking();
}
