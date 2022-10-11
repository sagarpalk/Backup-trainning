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
	@JoinColumn(name = "custId")
	private Customer customer;

	@ManyToOne
	@JoinColumn(name = "bookingId")
	private Booking booking;

	@ManyToOne
	@JoinColumn(name = "flightId")
	private Flight flight;

	public Report() {
		super();
	}

	public Report(int reportId, Customer customer, Booking booking, Flight flight) {
		super();
		this.reportId = reportId;
		this.customer = customer;
		this.booking = booking;
		this.flight = flight;
	}

	public int getReportId() {
		return reportId;
	}

	public void setReportId(int reportId) {
		this.reportId = reportId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
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
		return "Report [reportId=" + reportId + ", customer=" + customer + ", booking=" + booking + ", flight=" + flight
				+ "]";
	}

	

}
