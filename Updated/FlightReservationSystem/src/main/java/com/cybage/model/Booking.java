package com.cybage.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "bookings")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingId;
	private String bookingDate;
	private int numberofSeats;
	private double totalAmount;
 
	@ManyToOne
	@JoinColumn(name="passengerId")
	private Passenger passenger;
	
	@ManyToOne
	@JoinColumn(name = "flightId")
	private Flight flight;

	public Booking() {
		super();
	}

	public Booking(int bookingId, String bookingDate, int numberofSeats, double totalAmount, Passenger passenger,
			Flight flight) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.numberofSeats = numberofSeats;
		this.totalAmount = totalAmount;
		this.passenger = passenger;
		this.flight = flight;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	public int getNumberofSeats() {
		return numberofSeats;
	}

	public void setNumberofSeats(int numberofSeats) {
		this.numberofSeats = numberofSeats;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", bookingDate=" + bookingDate + ", numberofSeats=" + numberofSeats
				+ ", totalAmount=" + totalAmount + ", passenger=" + passenger + ", flight=" + flight + "]";
	}
	
	

}