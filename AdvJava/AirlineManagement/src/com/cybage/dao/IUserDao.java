package com.cybage.dao;

import java.sql.SQLException;

import com.cybage.model.User;

public interface IUserDao {
	User authenticateUser(String email,String password)throws SQLException;
	
	public boolean changePassword(String email, String password, String new_password)throws SQLException;
	
	public User getUserDeatils(String email,String password)throws SQLException;
	
	public User getSelectedUsersDetails(String email, String password) throws SQLException;
}
