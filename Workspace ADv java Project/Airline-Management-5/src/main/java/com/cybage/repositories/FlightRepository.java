package com.cybage.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cybage.model.Flight;


@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer>{
		
	
	// public Flight findByFlightName(String flightName);
	 
	 public List<Flight> findFlightByFlightSourceAndDestination(String flightSource, String destination);
}
