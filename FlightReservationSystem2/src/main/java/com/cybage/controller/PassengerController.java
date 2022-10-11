package com.cybage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.dtos.LoginUserDto;
import com.cybage.model.Passenger;
import com.cybage.model.User;
import com.cybage.service.PassengerService;





@RestController
@RequestMapping("/passengers")
@CrossOrigin("*")
public class PassengerController {
	
	@Autowired
	private PassengerService passengerService;
	
	
	@GetMapping("/getAllPassenger")
	public ResponseEntity<List<Passenger>> getAllCustomer(){
		return new ResponseEntity<List<Passenger>>(passengerService.getAllPassengers(), HttpStatus.OK);
	}
	
	@PostMapping("/")
	public ResponseEntity<String>addPassenger(@RequestBody Passenger passenger)
	{
		passengerService.addPassenger(passenger);
		return new ResponseEntity<String>("Passenger ADDED SUCCESSFULLY",HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String>deletePassengerById(@PathVariable int id)
	{
	   Passenger index=passengerService.getByID( id);
	   passengerService.deletePassengerById(index);
	   return new ResponseEntity<String>("DELETED SUCCESSFULLY",HttpStatus.CREATED);
	}
	
	@PostMapping("/findByEmail")
	public ResponseEntity<?>authenticateUser(@RequestBody LoginUserDto loginuser )
	{
		Passenger pasnger=passengerService.authenticatePassenegr(loginuser);
		if(pasnger==null)
			return Response.error("Invalid Login details..!!");
		return Response.success(pasnger);	
	}
}