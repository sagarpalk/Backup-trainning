package com.cybage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cybage.model.Flight;
import com.cybage.model.User;
import com.cybage.repositories.FlightRepository;

@Service
public class FlightService {
	@Autowired
	private FlightRepository flightRepository;

	public void AddFlight(Flight flight) {
		// TODO Auto-generated method stub
		flightRepository.save(flight);
	}

	
	public List<Flight> getFlightData() {
		// TODO Auto-generated method stub
		return flightRepository.findAll();
	}


	public void deleteFlightById(int id) {
		// TODO Auto-generated method stub
	 	flightRepository.findById(id);
	}


	public Flight getById(int id) {
		// TODO Auto-generated method stub
		return flightRepository.getById(id);
	}


	public void removeFlight(Flight flight) {
		// TODO Auto-generated method stub
		flightRepository.delete(flight);
		System.out.println("USER DELETED SUCCESSFULLY FROM DATABASE");
	}


	
	
}
