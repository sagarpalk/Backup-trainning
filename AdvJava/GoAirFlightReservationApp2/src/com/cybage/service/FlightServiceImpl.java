package com.cybage.service;

import java.util.List;

import com.cybage.dao.FlightDaoImpl;
import com.cybage.dao.IFlightDao;
import com.cybage.model.Flight;

public class FlightServiceImpl implements IFlightService{
	FlightDaoImpl flightDao=new FlightDaoImpl();
	@Override
	public List<Flight> getAllFlight() {
		
		return null;
	}

	@Override
	public Flight getAllBooking(int booking_id) {
		
		return flightDao.getAllBooking(booking_id);
	}

	@Override
	public Flight getFlightById(int flight_No) {
	IFlightDao dao=new FlightDaoImpl();
	return dao.getFlightById(flight_No);
		
	
	}

	@Override
	public Flight bookFlight(int flight_No) {
		System.out.println("sagar2");
		return flightDao.bookFlight(flight_No);
	}

}
