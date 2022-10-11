package com.cybage.service;

import java.util.List;

import com.cybage.dao.AdminDaoImpl;
import com.cybage.dao.IAdminDaoImpl;
import com.cybage.model.Flight;

public class AdminServiceImpl implements IAdminServiceImpl{

	@Override
	public void addFlight(Flight flight) {
	IAdminDaoImpl dao=new AdminDaoImpl();
		dao.addFlight(flight);
	}

	@Override
	public List<Flight> getAllFlight() {
		IAdminDaoImpl dao=new AdminDaoImpl();
		return dao.getAllFlights();
		

	}

	@Override
	public void updateFlightById(int flight_No) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteFlightById(int flight_No) {
		IAdminDaoImpl dao=new AdminDaoImpl();
		dao.deleteFlightById(flight_No);;		
	}

}
