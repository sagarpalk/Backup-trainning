package com.cybage.dao;

import java.util.List;

import com.cybage.model.Flight;

public interface IAdminDaoImpl {
//	List<Booking> getAllBooking();
	void addFlight(Flight flight);
	List<Flight> getAllFlights();
	void updateFlightById(int flight_No);
	void deleteFlightById(int flight_No);
//	List<complaints> viewAllComplaints();
}
