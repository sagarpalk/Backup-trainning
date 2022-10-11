package com.cybage.app.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import com.cybage.app.model.Flight_Route;
import com.cybage.app.model.Flight_Schedule;
import com.cybage.app.utilities.JDBCconnectivity;

public class FlightScheduleDaoImpl implements FlightScheduleDao {

	@Override
	public void schduleFLight(Flight_Schedule schedule) throws SQLException, ParseException {
		Connection connection = JDBCconnectivity.getConnection();
		Date flightarrival_date = null;
		Date flightdeparture_date = null;
		Time flightarrivalTime = null;
		Time flightdepartureTime = null;
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		DateFormat formatTime = new SimpleDateFormat("hh:mm:ss");
		flightarrival_date = format.parse(schedule.getArrivalDate());
		flightdeparture_date = format.parse(schedule.getDepartureDate());
		java.sql.Date flightarrival = new java.sql.Date(flightarrival_date.getTime());
		java.sql.Date flightdeparture = new java.sql.Date(flightdeparture_date.getTime());
		System.out.println(flightarrival + " " + flightdeparture);
		long aTime = formatTime.parse(schedule.getArrivalTime()).getTime();
		long dTime = formatTime.parse(schedule.getDepartureTime()).getTime();
		
		flightarrivalTime = new Time(aTime);
		flightdepartureTime = new Time(dTime);
		// Timestamp arrival_time = new Timestamp(flightarrivalTime.getTime());
		// Timestamp departure_time = new Timestamp(flightdepartureTime.getTime());
		System.out.println("arrival date:-" + flightarrival + " departure date" + flightdeparture + " arrival time:-"
				+ flightarrivalTime + " departure time" + flightdepartureTime);
		PreparedStatement scheduleflight = connection.prepareStatement(
				"insert into schedule(sc_departdate,sc_departtime,sc_arrivaldate,sc_arrivaltime,sc_flightstop,sc_flightid,sc_routeid,sc_offerid,sc_availibilitystatus) values(?,?,?,?,?,?,?,?,?)");
		scheduleflight.setDate(1, flightdeparture);
		scheduleflight.setTime(2, flightdepartureTime);
		scheduleflight.setDate(3, flightarrival);
		scheduleflight.setTime(4, flightarrivalTime);
		scheduleflight.setString(5, schedule.getStopType());
		scheduleflight.setInt(6, schedule.getFlightId());
		scheduleflight.setInt(7, schedule.getRouteId());
		scheduleflight.setInt(8, schedule.getOfferId());
		scheduleflight.setString(9, schedule.getAvailibilityStatus());
		scheduleflight.executeUpdate();
		System.out.println("Schedule Successfull");
	}

}
