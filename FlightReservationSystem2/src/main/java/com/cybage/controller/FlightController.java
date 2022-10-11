package com.cybage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.model.Flight;
import com.cybage.model.User;
import com.cybage.service.FlightService;

@RestController
@RequestMapping("/flights")
@CrossOrigin("*")
public class FlightController {
	@Autowired
	private FlightService flightService;
	
	@PostMapping("/")
	public ResponseEntity<String>AddFlight(@RequestBody Flight flight)
	{
		flightService.AddFlight(flight);
		return new ResponseEntity<String>("FLIGHT ADDED SUCCESSFULLY",HttpStatus.CREATED);
	}
	
	
	@GetMapping("/getAllFlight")
	public ResponseEntity<List<Flight>> getFlightData()
	{
		return new ResponseEntity<List<Flight>>(flightService.getFlightData(),HttpStatus.OK);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteFlight(@PathVariable int id)
	{
		System.out.println("Hello");
		Flight index=flightService.getById(id);
		flightService.removeFlight(index);
		return new ResponseEntity<String>("DELETED SUCCESSFULLY",HttpStatus.CREATED);
	}
	
	
}
