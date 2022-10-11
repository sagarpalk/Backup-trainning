package com.cybage.app.service;

import java.sql.SQLException;

import com.cybage.app.model.BookTicket;

public interface BookTicketService {
	int addBookTicket(BookTicket ticket) throws SQLException;
	
	void cancelTicket(int flightticketid) throws SQLException;
	

}
