package com.cybage.app.model;

public class Flight_Route {
	private String flight_source;
	private String flight_destination;
	public Flight_Route(String flight_source, String flight_destination) {
		super();
		this.flight_source = flight_source;
		this.flight_destination = flight_destination;
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
	
}
