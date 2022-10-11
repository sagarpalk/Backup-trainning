package com.cybage.model;

import java.sql.Date;
import java.sql.Time;

public class Flight {
	private int flight_No, flight_total_no_seats, flight_avaliable_seats, flight_price;
	private String flight_name, flight_source, flight_destination, flight_type;
	private Time flight_time;
	private Date flight_date;
	
	

	public Flight(int flight_No, int flight_total_no_seats, int flight_price, String flight_type, Time flight_time,
			Date flight_date) {
		super();
		this.flight_No = flight_No;
		this.flight_total_no_seats = flight_total_no_seats;
		this.flight_price = flight_price;
		this.flight_type = flight_type;
		this.flight_time = flight_time;
		this.flight_date = flight_date;
	}

	public Flight(int flight_No, int flight_total_no_seats, int flight_avaliable_seats, int flight_price,
			String flight_name, String flight_source, String flight_destination, String flight_type, Time flight_time,
			Date flight_date) {
		super();
		this.flight_No = flight_No;
		this.flight_total_no_seats = flight_total_no_seats;
		this.flight_avaliable_seats = flight_avaliable_seats;
		this.flight_price = flight_price;
		this.flight_name = flight_name;
		this.flight_source = flight_source;
		this.flight_destination = flight_destination;
		this.flight_type = flight_type;
		this.flight_time = flight_time;
		this.flight_date = flight_date;
	}

	public Flight(int flight_No, String flight_name, int flight_price) {
		super();
		this.flight_No = flight_No;
		this.flight_price = flight_price;
		this.flight_name = flight_name;
	}

	

	public Flight(int flight_No, int flight_total_no_seats, int flight_price, String flight_name, String flight_source,
			String flight_destination, String flight_type, Time flight_time, Date flight_date) {
		super();
		this.flight_No = flight_No;
		this.flight_total_no_seats = flight_total_no_seats;
		this.flight_price = flight_price;
		this.flight_name = flight_name;
		this.flight_source = flight_source;
		this.flight_destination = flight_destination;
		this.flight_type = flight_type;
		this.flight_time = flight_time;
		this.flight_date = flight_date;
	}

	public int getFlight_No() {
		return flight_No;
	}

	public void setFlight_No(int flight_No) {
		this.flight_No = flight_No;
	}

	public int getFlight_total_no_seats() {
		return flight_total_no_seats;
	}

	public void setFlight_total_no_seats(int flight_total_no_seats) {
		this.flight_total_no_seats = flight_total_no_seats;
	}

	public int getFlight_avaliable_seats() {
		return flight_avaliable_seats;
	}

	public void setFlight_avaliable_seats(int flight_avaliable_seats) {
		this.flight_avaliable_seats = flight_avaliable_seats;
	}

	public int getFlight_price() {
		return flight_price;
	}

	public void setFlight_price(int flight_price) {
		this.flight_price = flight_price;
	}

	public String getFlight_name() {
		return flight_name;
	}

	public void setFlight_name(String flight_name) {
		this.flight_name = flight_name;
	}

	public String getFlight_source() {
		return flight_source;
	}

	public void setFlight_source(String flight_source) {
		this.flight_source = flight_source;
	}

	public String getFlight_destination() {
		return flight_destination;
	}

	public void setFlight_destination(String flight_destination) {
		this.flight_destination = flight_destination;
	}

	public String getFlight_type() {
		return flight_type;
	}

	public void setFlight_type(String flight_type) {
		this.flight_type = flight_type;
	}

	public Time getFlight_time() {
		return flight_time;
	}

	public void setFlight_time(Time flight_time) {
		this.flight_time = flight_time;
	}

	public Date getFlight_date() {
		return flight_date;
	}

	public void setFlight_date(Date flight_date) {
		this.flight_date = flight_date;
	}

	@Override
	public String toString() {
		return "Flight [flight_No=" + flight_No + ", flight_total_no_seats=" + flight_total_no_seats
				+ ", flight_avaliable_seats=" + flight_avaliable_seats + ", flight_price=" + flight_price
				+ ", flight_name=" + flight_name + ", flight_source=" + flight_source + ", flight_destination="
				+ flight_destination + ", flight_type=" + flight_type + ", flight_time=" + flight_time
				+ ", flight_date=" + flight_date + "]";
	}

}
