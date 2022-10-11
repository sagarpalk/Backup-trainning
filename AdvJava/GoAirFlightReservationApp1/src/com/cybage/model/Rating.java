package com.cybage.model;

public class Rating {
private int rating_id,rating_rating,booking_id;
private String description;
public Rating() {
	super();
}
public Rating(int rating_id, int rating_rating, int booking_id, String description) {
	super();
	this.rating_id = rating_id;
	this.rating_rating = rating_rating;
	this.booking_id = booking_id;
	this.description = description;
}
public int getRating_id() {
	return rating_id;
}
public void setRating_id(int rating_id) {
	this.rating_id = rating_id;
}
public int getRating_rating() {
	return rating_rating;
}
public void setRating_rating(int rating_rating) {
	this.rating_rating = rating_rating;
}
public int getBooking_id() {
	return booking_id;
}
public void setBooking_id(int booking_id) {
	this.booking_id = booking_id;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
@Override
public String toString() {
	return "Rating [rating_id=" + rating_id + ", rating_rating=" + rating_rating + ", booking_id=" + booking_id
			+ ", description=" + description + "]";
}
}
