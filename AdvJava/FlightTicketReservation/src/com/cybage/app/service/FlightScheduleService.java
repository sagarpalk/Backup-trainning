package com.cybage.app.service;



import java.sql.SQLException;
import java.text.ParseException;

import com.cybage.app.model.Flight_Route;
import com.cybage.app.model.Flight_Schedule;

public interface FlightScheduleService {
	
	public void schduleFLight(Flight_Schedule schedule) throws SQLException, ParseException;
}
