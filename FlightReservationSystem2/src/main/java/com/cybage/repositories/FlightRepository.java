package com.cybage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybage.model.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer>{
	
}
