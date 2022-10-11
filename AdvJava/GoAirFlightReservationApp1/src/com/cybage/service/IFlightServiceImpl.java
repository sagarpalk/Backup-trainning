package com.cybage.service;

import java.util.List;

import com.cybage.model.Flight;

public interface IFlightServiceImpl {
	List<Flight> getAllFlight();
	Flight getFlightById(int flight_No);
	 Flight getAllBooking(int booking_id);
	 Flight bookFlight(int flight_No);
}
