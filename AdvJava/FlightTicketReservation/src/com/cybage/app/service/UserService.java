package com.cybage.app.service;

import java.sql.SQLException;

import com.cybage.app.model.LoginBean;
import com.cybage.app.model.User;



public interface UserService {
	public void registerUser(User user) throws SQLException;
	public boolean validate(LoginBean loginBean) throws SQLException;
	public void displayAllUsers() throws SQLException;
	
	public void deleteUser(int id) throws SQLException;
	public void updateUserDetails(User user) throws SQLException;
}
