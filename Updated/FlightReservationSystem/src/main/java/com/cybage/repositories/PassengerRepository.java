package com.cybage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybage.model.Passenger;




@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Integer>{

	
	Passenger findByEmail(String email);
}
