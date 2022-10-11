package com.cybage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cybage.model.Flight;
import com.cybage.repositories.FlightRepository;

@Service
public class FlightService {
	@Autowired
	private FlightRepository flightRepository;

	public void addFlight(Flight flight) {
		System.out.println(flight);
		flightRepository.save(flight);
	}

	public List<Flight> getAllFlight() {
		return flightRepository.findAll();
	}

	public Flight getById(int id) {
		flightRepository.findById(id);
		return flightRepository.getById(id);
	}

	public void removeFlight(Flight flight) {
		flightRepository.delete(flight);
		System.out.println("Fligts deleted from Database");
	}
	
	public void updateFlight(Flight flight) {
		flightRepository.save(flight);
	}

//	public Flight getFlightByName(String flightName) {
//		return flightRepository.findByFlightName(flightName);
//	}

	public List<Flight> getFlightBysourceAndDest(String flightSource,String destination) {
		return flightRepository.findFlightByFlightSourceAndDestination(flightSource, destination);
	}

}
