package com.cybage.service;

import java.util.List;

import com.cybage.dao.AdminDaoImpl;
import com.cybage.dao.IAdminDao;
import com.cybage.model.Flight;

public class AdminServiceImpl implements IAdminService{

	@Override
	public void addFlight(Flight flight) {
	IAdminDao dao=new AdminDaoImpl();
		dao.addFlight(flight);
	}

	@Override
	public List<Flight> getAllFlight() {
		IAdminDao dao=new AdminDaoImpl();
		return dao.getAllFlights();
		

	}

	@Override
	public void updateFlightById(int flight_No) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteFlightById(int flight_No) {
		IAdminDao dao=new AdminDaoImpl();
		dao.deleteFlightById(flight_No);;		
	}

}
