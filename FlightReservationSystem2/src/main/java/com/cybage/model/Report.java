package com.cybage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Reports")
public class Report {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reportId;

	@ManyToOne
	@JoinColumn(name = "passengerId")
	private Passenger passenger;

	@ManyToOne
	@JoinColumn(name = "bookingId")
	private Booking booking;

	@ManyToOne
	@JoinColumn(name = "flightId")
	private Flight flight;

	public Report() {
		super();
	}

	public Report(int reportId, Passenger passenger, Booking booking, Flight flight) {
		super();
		this.reportId = reportId;
		this.passenger = passenger;
		this.booking = booking;
		this.flight = flight;
	}

	public int getReportId() {
		return reportId;
	}

	public void setReportId(int reportId) {
		this.reportId = reportId;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	@Override
	public String toString() {
		return "Report [reportId=" + reportId + ", passenger=" + passenger + ", booking=" + booking + ", flight="
				+ flight + "]";
	}
	
	

}
