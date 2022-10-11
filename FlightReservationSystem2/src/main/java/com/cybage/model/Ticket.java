package com.cybage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tickets")
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ticketId;

	private String ticketDate;

	@ManyToOne
	@JoinColumn(name="bookingId")
	private Booking booking;

	public Ticket() {
		super();
	}

	public Ticket(int ticketId, String ticketDate, Booking booking) {
		super();
		this.ticketId = ticketId;
		this.ticketDate = ticketDate;
		this.booking = booking;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public String getTicketDate() {
		return ticketDate;
	}

	public void setTicketDate(String ticketDate) {
		this.ticketDate = ticketDate;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", ticketDate=" + ticketDate + ", booking=" + booking + "]";
	}
	
	
}
