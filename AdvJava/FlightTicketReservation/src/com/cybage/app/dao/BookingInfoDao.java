package com.cybage.app.dao;

import java.sql.SQLException;
import java.util.List;

import com.cybage.app.model.BookingInfo;

public interface BookingInfoDao {
        BookingInfo findBookinInfoById(int ticketId) throws SQLException;
        List<BookingInfo>getAllTicket(int userid) throws SQLException;
        List<BookingInfo>getBookingInfoByScheduleId(int scheduleId) throws SQLException;
        List<BookingInfo> getPassengerDetailsByseatType(String seatType) throws SQLException;
        List<BookingInfo> getPassengerDetailsByShift(String shift) throws SQLException;
        
        
}
