package com.cybage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.model.Booking;
import com.cybage.model.Customer;
import com.cybage.repositories.BookingRepository;
import com.cybage.repositories.CustomerRepository;

@Service
public class BookingService {
	@Autowired
	private BookingRepository bookingRepository;

	public void addBooking(Booking booking) {
		System.out.println(booking);
		bookingRepository.save(booking);
	}

	public List<Booking> getAllBooking() {
		return bookingRepository.findAll();
	}

//	public Customer getById(int id) {
//		customerRepository.findById(id);
//		return customerRepository.getById(id);
//	}
//
//	public void removeCustomers(Customer customer) {
//		customerRepository.delete(customer);
//		System.out.println("Record deleted from Database");
//	}
//	
//	public void updateCustomer(Customer customer) {
//		customerRepository.save(customer);
//	}
}
