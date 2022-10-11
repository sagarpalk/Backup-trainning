package com.cybage.app.service;

import java.sql.Connection;
import java.sql.SQLException;

import com.cybage.app.dao.BookTicketDaoImpl;
import com.cybage.app.model.BookTicket;
import com.cybage.app.utilities.JDBCconnectivity;

public class BookTicketServiceImpl implements BookTicketService {
	Connection connection=JDBCconnectivity.getConnection();
	@Override
	public int addBookTicket(BookTicket ticket) throws SQLException {
	      BookTicketDaoImpl ticketDaoImpl=new BookTicketDaoImpl();
	        
		
		return ticketDaoImpl.addBookTicket(ticket);
	}
	@Override
	public void cancelTicket(int flightticketid) throws SQLException {
		 BookTicketDaoImpl ticketDaoImpl=new BookTicketDaoImpl();
				 ticketDaoImpl.cancelTicket(flightticketid);
		
	}
	

}
