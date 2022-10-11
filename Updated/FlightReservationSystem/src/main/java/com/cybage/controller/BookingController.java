package com.cybage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.model.Booking;
import com.cybage.model.Offer;
import com.cybage.model.User;
import com.cybage.service.BookingService;
import com.cybage.service.OfferService;

@RestController
@RequestMapping("/bookings")
@CrossOrigin("*")
public class BookingController {
    @Autowired
    private  BookingService bookingService;
	
    
	@PostMapping("/")
	public ResponseEntity<String>addBooking(@RequestBody Booking booking)
	{
		System.out.println("In postman");
		bookingService.addBooking(booking);
		return new ResponseEntity<String>("Booking ADDED SUCCESSFULLY",HttpStatus.CREATED);
	}
	
	
	@GetMapping("/getAllBooking")
	public ResponseEntity<List<Booking>> getAllBooking()
	{
		return new ResponseEntity<List<Booking>>(bookingService.getAllOffer(),HttpStatus.OK);
		
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteById(@PathVariable int id)
	{
		Booking index=bookingService.getById(id);
		
		bookingService.removeBooking(index);
		return new ResponseEntity<String>("DELETED Booking SUCCESSFULLY",HttpStatus.CREATED);
	}
	
}
