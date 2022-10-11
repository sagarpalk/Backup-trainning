package com.cybage.app.service;

import java.sql.SQLException;
import java.text.ParseException;

import com.cybage.app.dao.FlightScheduleDaoImpl;
import com.cybage.app.model.Flight_Route;
import com.cybage.app.model.Flight_Schedule;

public class FlightScheduleServiceImpl implements FlightScheduleService {
	FlightScheduleDaoImpl schedule1=new FlightScheduleDaoImpl();

	@Override
	public void schduleFLight(Flight_Schedule schedule) throws SQLException, ParseException {
		// TODO Auto-generated method stub
		schedule1.schduleFLight(schedule);
	}
	

}
