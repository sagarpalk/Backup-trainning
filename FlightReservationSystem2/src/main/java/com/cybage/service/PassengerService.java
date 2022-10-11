package com.cybage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.dtos.LoginUserDto;

import com.cybage.model.Passenger;
import com.cybage.repositories.PassengerRepository;


@Service
public class PassengerService {
	
	@Autowired
	private PassengerRepository passengerRepository;

	public List<Passenger> getAllPassengers() {
		// TODO Auto-generated method stub
		return passengerRepository.findAll();
	}

	

	public void addPassenger(Passenger passenger) {
		// TODO Auto-generated method stub
		System.out.println("Passenger");
		passengerRepository.save(passenger);
		System.out.println("Passenger Added");
	}



	public Passenger getByID(int id) {
		// TODO Auto-generated method stub
		return passengerRepository.getById(id);
	}



	public void deletePassengerById(Passenger passenger) {
		// TODO Auto-generated method stub
		passengerRepository.delete(passenger);
		System.out.println("passenger deleted");
	}



	public Passenger authenticatePassenegr(LoginUserDto loginuser) {
		// TODO Auto-generated method stub
		Passenger passenger=passengerRepository.findByEmail(loginuser.getEmail());
		if(passenger !=null)
		{
			if(loginuser.getEmail().equals(passenger.getEmail()) && passenger.getPassword().equals(loginuser.getPassword()))
			{
				return passenger;
			}				
		}
		return null;
	}

}
