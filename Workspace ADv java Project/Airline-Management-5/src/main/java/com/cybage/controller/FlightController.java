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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.model.Flight;
import com.cybage.service.FlightService;

@RestController
@RequestMapping("/flights")
public class FlightController {
	@Autowired
	private FlightService flightService;

	@PostMapping("/")
	public ResponseEntity<String> addFlight(@RequestBody Flight flight) {
		flightService.addFlight(flight);
		return new ResponseEntity<String>("Flight added successfully", HttpStatus.CREATED);
	}

	@GetMapping("/getAllFlight")
	public ResponseEntity<List<Flight>> getAllFlight() {
		return new ResponseEntity<List<Flight>>(flightService.getAllFlight(), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteFlight(@PathVariable int id) {
		Flight index = flightService.getById(id);
		flightService.removeFlight(index);
		return new ResponseEntity<String>("Flight record deleted successfully", HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Flight> getFlightById(@PathVariable int id) {
		Flight flight = flightService.getById(id);
		return new ResponseEntity<Flight>(flight, HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<String> updateFlight(@RequestBody Flight flight) {

		flightService.updateFlight(flight);
		return new ResponseEntity<String>("Record updated successfully", HttpStatus.CREATED);
	}

//	@GetMapping("/byFlightName/{flightName}")
//	public ResponseEntity<Flight> getFlightByName(@PathVariable String flightName) {
//		return new ResponseEntity<Flight>(flightService.getFlightByName(flightName), HttpStatus.OK);
//	}
//
	@GetMapping("/serchFlight/{flightSource}/{destination}")
	public ResponseEntity<List<Flight>> getFlightByFlightSourceAndDest(@PathVariable String flightSource,
			@PathVariable String destination) {
		return new ResponseEntity<List<Flight>>(flightService.getFlightBysourceAndDest(flightSource, destination),
				HttpStatus.OK);
	}

}
