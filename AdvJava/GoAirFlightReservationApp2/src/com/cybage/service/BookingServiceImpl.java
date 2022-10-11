package com.cybage.service;

import com.cybage.dao.IAdminDao;
import com.cybage.dao.AdminDaoImpl;
import com.cybage.dao.IBookingDao;
import com.cybage.dao.BookingDaoImpl;
import com.cybage.model.Booking;

public class BookingServiceImpl implements IBookingService{

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
	IBookingDao dao=new BookingDaoImpl();
       dao.addBooking(booking);
	
}

}
