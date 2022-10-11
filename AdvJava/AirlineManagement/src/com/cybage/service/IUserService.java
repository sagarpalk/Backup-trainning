package com.cybage.service;

import java.sql.SQLException;

import com.cybage.model.User;

public interface IUserService {
User authenticateUser(String email,String password)throws SQLException;
	
	public boolean changePassword(String email, String password, String new_password)throws SQLException;
	
	public User getUserDeatils(String email,String password)throws SQLException;
	
	public User getSelectedUsersDetails(String email, String password) throws SQLException;
}
