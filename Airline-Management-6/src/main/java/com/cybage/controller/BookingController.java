package com.cybage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cybage.model.Booking;
import com.cybage.model.Customer;
import com.cybage.service.BookingService;
import com.cybage.service.CustomerService;

@Controller
@RequestMapping("/book")
public class BookingController {
	@Autowired
	private BookingService bookingService;

	@PostMapping("/addBook")
	public ResponseEntity<?> addCustomer(@RequestBody Booking booking) {
		
		bookingService.addBooking(booking);
		System.out.println(booking);
		return new ResponseEntity<>("Record added successfully", HttpStatus.ACCEPTED);
	}

	@GetMapping("/getAllBooking")
	public ResponseEntity<List<Booking>> getAllBooking() {
		System.out.println("Hello");
		return new ResponseEntity<List<Booking>>(bookingService.getAllBooking(), HttpStatus.OK);
	}

//	@DeleteMapping("/{id}")
//	public ResponseEntity<String> deleteCustomer(@PathVariable int id) {
//		Customer index = customerService.getById(id);
//		customerService.removeCustomers(index);
//		return new ResponseEntity<String>("Record deleted successfully", HttpStatus.CREATED);
//	}
}
