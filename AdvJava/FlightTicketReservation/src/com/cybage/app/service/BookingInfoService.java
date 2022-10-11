package com.cybage.app.service;

import java.sql.SQLException;
import java.util.List;

import com.cybage.app.model.BookingInfo;

public interface BookingInfoService {
	  BookingInfo findBookinInfoById(int ticketId) throws SQLException;
	  List<BookingInfo>getAllTicket(int userid) throws SQLException;
	  List<BookingInfo>getBookingInfoByScheduleId(int ScheduleId) throws SQLException;
	  List<BookingInfo>getPassengerDetailsByseatType(String seatType) throws SQLException;
	  List<BookingInfo> getPassengerDetailsByShift(String shift) throws SQLException;
}
