package com.cybage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.model.Booking;
import com.cybage.model.Offer;
import com.cybage.model.User;
import com.cybage.repositories.BookingRepository;

@Service
public class BookingService {

	@Autowired
	private BookingRepository bookingRepository;
	
	public List<Booking> getAllOffer() {
		// TODO Auto-generated method stub
		return bookingRepository.findAll();
	}

	public Booking getById(int id) {
		// TODO Auto-generated method stub
		return bookingRepository.getById(id);
	}

	

	public void removeBooking(Booking booking) {
		// TODO Auto-generated method stub
	      bookingRepository.delete(booking);
	      System.out.println("Booking DELETED SUCCESSFULLY FROM DATABASE");
	}
	

	public void addBooking(Booking booking) {
		// TODO Auto-generated method stub
		bookingRepository.save(booking);
	}
}
