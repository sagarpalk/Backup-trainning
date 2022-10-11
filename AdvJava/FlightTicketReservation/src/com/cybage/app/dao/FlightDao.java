package com.cybage.app.dao;

import java.sql.SQLException;


import com.cybage.app.model.Flight;
import com.cybage.app.model.Flight_Route;
import com.cybage.app.model.SeatPrice;

public interface FlightDao {
	public void addNewFlight(Flight newFlight) throws SQLException;
	public void addSeatPrice(SeatPrice price) throws SQLException;
	public void addFlightRoute(Flight_Route flightroute) throws SQLException;
}
