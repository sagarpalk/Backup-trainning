package com.cybage.app.dao;

import java.sql.SQLException;
import java.text.ParseException;

import com.cybage.app.model.Flight_Route;
import com.cybage.app.model.Flight_Schedule;

public interface FlightScheduleDao {
	
	public void schduleFLight(Flight_Schedule schedule) throws SQLException, ParseException;
}
