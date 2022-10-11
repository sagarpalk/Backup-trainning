package com.cybage.app.service;

import java.sql.SQLException;

import com.cybage.app.dao.FlightDaoImpl;
import com.cybage.app.model.Flight;
import com.cybage.app.model.Flight_Route;
import com.cybage.app.model.SeatPrice;

public class FlightServiceImpl implements FlightService {
	FlightDaoImpl addFlightDetails=new FlightDaoImpl();
	@Override
	public void addNewFlight(Flight newFlight) throws SQLException {
		System.out.println("Inside Flight Service");
		System.out.println(newFlight);
		addFlightDetails.addNewFlight(newFlight);
	}
	@Override
	public void addSeatPrice(SeatPrice price) throws SQLException {
		addFlightDetails.addSeatPrice(price);
	}
	@Override
	public void addFlightRoute(Flight_Route route) throws SQLException {
		addFlightDetails.addFlightRoute(route);
		
	}



}
