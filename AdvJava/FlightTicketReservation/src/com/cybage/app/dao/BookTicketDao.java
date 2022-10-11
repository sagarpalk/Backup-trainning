package com.cybage.app.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cybage.app.model.BookTicket;

public interface BookTicketDao {
	int addBookTicket(BookTicket ticket) throws SQLException;
	public void cancelTicket(int ticketid) throws SQLException;


}
