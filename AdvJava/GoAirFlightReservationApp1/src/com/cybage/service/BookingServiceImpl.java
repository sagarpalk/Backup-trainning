package com.cybage.service;

import com.cybage.dao.IAdminDaoImpl;
import com.cybage.dao.AdminDaoImpl;
import com.cybage.dao.IBookingDaoImpl;
import com.cybage.dao.BookingDaoImpl;
import com.cybage.model.Booking;

public class BookingServiceImpl implements IBookingServiceImpl{

	@Override
	public void searchFlight(String sounce, String destination) {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void addBooking(booking) {
//		
//		BookingDao dao=new BookingDaoImpl();
//		dao.addBooking(booking);
//		
//		
//	}

	@Override
	public void deleteBookingById(int booking_id) {
		// TODO Auto-generated method stub
		
	}

@Override
public void addBooking(Booking booking) {
	IBookingDaoImpl dao=new BookingDaoImpl();
       dao.addBooking(booking);
	
}

}
