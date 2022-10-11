package com.cybage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybage.model.Flight;
import com.cybage.model.User;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer> {

}
