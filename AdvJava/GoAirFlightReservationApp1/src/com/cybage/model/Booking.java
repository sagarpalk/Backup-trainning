package com.cybage.model;

import java.sql.Date;

public class Booking {
private int booking_id,ticket_price;  //bookinhId
private Flight flight_No;
private User user_id;
private String bookingDate;
private String flight_class;
private boolean status;
public Booking() {
	super();
}
public Booking(int booking_id, int ticket_price, Flight flight_No, User user_id, String bookingDate,
		String flight_class, boolean status) {
	super();
	this.booking_id = booking_id;
	this.ticket_price = ticket_price;
	this.flight_No = flight_No;
	this.user_id = user_id;
	this.bookingDate = bookingDate;
	this.flight_class = flight_class;
	this.status = status;
}
public Booking(int booking_id, Flight flight_No,String flight_class,
		boolean status) {
	super();
	this.booking_id = booking_id;
	this.flight_No = flight_No;


	this.flight_class = flight_class;
	this.status = status;
}

	public Booking(Flight flight_No, String flight_class, boolean status) {
	super();
	this.flight_No = flight_No;
	this.flight_class = flight_class;
	this.status = status;
}
/*
	 * public Booking(int bookingId, String status2, int flight_No1, String
	 * flight_type, int flight_price, int userId, Date flight_date) {
	 * this.booking_id=bookingId; this.status=status; this. }
	 */
public int getBooking_id() {
	return booking_id;
}
public void setBooking_id(int booking_id) {
	this.booking_id = booking_id;
}
public int getTicket_price() {
	return ticket_price;
}
public void setTicket_price(int ticket_price) {
	this.ticket_price = ticket_price;
}
public Flight getFlight_No() {
	return flight_No;
}
public void setFlight_No(Flight flight_No) {
	this.flight_No = flight_No;
}
public User getUser_id() {
	return user_id;
}
public void setUser_id(User user_id) {
	this.user_id = user_id;
}
public String getBookingDate() {
	return bookingDate;
}
public void setBookingDate(String bookingDate) {
	this.bookingDate = bookingDate;
}
public String getFlight_class() {
	return flight_class;
}
public void setFlight_class(String flight_class) {
	this.flight_class = flight_class;
}
public boolean isStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}
@Override
public String toString() {
	return "Booking [booking_id=" + booking_id + ", ticket_price=" + ticket_price + ", flight_No=" + flight_No
			+ ", user_id=" + user_id + ", bookingDate=" + bookingDate + ", flight_class=" + flight_class + ", status="
			+ status + "]";
}



}
