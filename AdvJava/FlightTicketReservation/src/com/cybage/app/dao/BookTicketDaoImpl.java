package com.cybage.app.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cybage.app.model.BookTicket;
import com.cybage.app.utilities.JDBCconnectivity;

public class BookTicketDaoImpl implements BookTicketDao {
	Connection connection=JDBCconnectivity.getConnection();
	@Override
	public int addBookTicket(BookTicket ticket) throws SQLException {
		PreparedStatement bookTicket= connection.prepareStatement("insert into ticket_record(tr_passportid,tr_class,tr_numtickets,tr_status,tr_userid,tr_scheduleId) values(?,?,?,?,?,?)");
		bookTicket.setInt(1, ticket.getPassportId());
		bookTicket.setString(2, ticket.getClassType());
	    bookTicket.setInt(3, ticket.getNumTickets());
		bookTicket.setString(4, ticket.getStatus());																							
		bookTicket.setInt(5, ticket.getUserId());
		bookTicket.setInt(6, ticket.getScheduleId());
		return bookTicket.executeUpdate();
	}
	
	@Override
	public void cancelTicket(int ticketid) throws SQLException {
		PreparedStatement bookTicket= connection.prepareStatement("delete from ticket_record where tr_ticketrecordid=?");
		  bookTicket.setInt(1, ticketid);
		 bookTicket.executeUpdate();
	}

}
