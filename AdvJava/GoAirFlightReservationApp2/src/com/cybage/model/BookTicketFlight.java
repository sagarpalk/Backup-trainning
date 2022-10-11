package com.cybage.model;

public class BookTicketFlight {
	private int flightNo;
	private String departure_date;
	private String flight_time;
	private String flightClass;
	private int flightPrice;
	private int NoOfSeats;
	public BookTicketFlight() {
		super();
	}
	public BookTicketFlight(int flightNo, String departure_date, String flight_time, String flightClass,
			int flightPrice, int noOfSeats) {
		super();
		this.flightNo = flightNo;
		this.departure_date = departure_date;
		this.flight_time = flight_time;
		this.flightClass = flightClass;
		this.flightPrice = flightPrice;
		NoOfSeats = noOfSeats;
	}
	public int getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}
	public String getDeparture_date() {
		return departure_date;
	}
	public void setDeparture_date(String departure_date) {
		this.departure_date = departure_date;
	}
	public String getFlight_time() {
		return flight_time;
	}
	public void setFlight_time(String flight_time) {
		this.flight_time = flight_time;
	}
	public String getFlightClass() {
		return flightClass;
	}
	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}
	public int getFlightPrice() {
		return flightPrice;
	}
	public void setFlightPrice(int flightPrice) {
		this.flightPrice = flightPrice;
	}
	public int getNoOfSeats() {
		return NoOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		NoOfSeats = noOfSeats;
	}
	@Override
	public String toString() {
		return "BookTicketFlight [flightNo=" + flightNo + ", departure_date=" + departure_date + ", flight_time="
				+ flight_time + ", flightClass=" + flightClass + ", flightPrice=" + flightPrice + ", NoOfSeats="
				+ NoOfSeats + "]";
	}
	
	
}
