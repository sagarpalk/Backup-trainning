package com.cybage.app.service;

import java.sql.SQLException;
import java.util.List;

import com.cybage.app.dao.BookTicketDaoImpl;
import com.cybage.app.dao.BookingInfoDaoImpl;
import com.cybage.app.model.BookingInfo;

public class BookingInfoServiceImpl implements BookingInfoService {

	@Override
	public BookingInfo findBookinInfoById(int ticketId) throws SQLException {
		   BookingInfoDaoImpl bookingInfoDaoImpl=new BookingInfoDaoImpl();
		
		return bookingInfoDaoImpl.findBookinInfoById(ticketId);
	}

	@Override
	public List<BookingInfo> getAllTicket(int userid) throws SQLException {
		BookingInfoDaoImpl bookingInfoDaoImpl=new BookingInfoDaoImpl();
		return bookingInfoDaoImpl.getAllTicket(userid);
	}

	@Override
	public List<BookingInfo> getBookingInfoByScheduleId(int ScheduleId) throws SQLException {
		BookingInfoDaoImpl bookingInfoDaoImpl=new BookingInfoDaoImpl();
		
		return bookingInfoDaoImpl.getBookingInfoByScheduleId(ScheduleId);
	}

	@Override
	public List<BookingInfo> getPassengerDetailsByseatType(String seatType) throws SQLException {
		BookingInfoDaoImpl bookingInfoDaoImpl=new BookingInfoDaoImpl();
		return bookingInfoDaoImpl.getPassengerDetailsByseatType(seatType);
	}

	@Override
	public List<BookingInfo> getPassengerDetailsByShift(String shift) throws SQLException {
		BookingInfoDaoImpl bookingInfoDaoImpl=new BookingInfoDaoImpl();  
		return bookingInfoDaoImpl.getPassengerDetailsByShift(shift);
	}

	
}
