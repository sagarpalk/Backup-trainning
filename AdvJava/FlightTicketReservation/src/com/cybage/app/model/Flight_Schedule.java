package com.cybage.app.model;

import java.sql.Date;

public class Flight_Schedule {
	private String arrivalDate;
	private String departureDate;
	private String arrivalTime;
	private String DepartureTime;
	private String StopType;
	private String availibilityStatus;
	
	public Flight_Schedule(String arrivalDate, String departureDate, String arrivalTime, String departureTime,
			String stopType, String availibilityStatus, int flightId, int routeId, int offerId) {
		super();
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
		this.arrivalTime = arrivalTime;
		DepartureTime = departureTime;
		StopType = stopType;
		this.availibilityStatus = availibilityStatus;
		this.flightId = flightId;
		this.routeId = routeId;
		this.offerId = offerId;
	}
	public String getAvailibilityStatus() {
		return availibilityStatus;
	}
	public void setAvailibilityStatus(String availibilityStatus) {
		this.availibilityStatus = availibilityStatus;
	}
	private int flightId;
	private int routeId;
	private int offerId;

	public String getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDepartureTime() {
		return DepartureTime;
	}
	public void setDepartureTime(String departureTime) {
		DepartureTime = departureTime;
	}
	public String getStopType() {
		return StopType;
	}
	public void setStopType(String stopType) {
		StopType = stopType;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public int getRouteId() {
		return routeId;
	}
	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}
	public int getOfferId() {
		return offerId;
	}
	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}
	
	
}
