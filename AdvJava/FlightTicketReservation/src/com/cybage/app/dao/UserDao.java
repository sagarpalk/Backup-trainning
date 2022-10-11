package com.cybage.app.dao;

import java.sql.SQLException;
import java.util.List;

import com.cybage.app.model.LoginBean;
import com.cybage.app.model.User;



public interface UserDao {
	public int registerUser(User user) throws SQLException;
	public boolean validate(LoginBean loginBean) throws SQLException;
	public List<User> displayAllUsers() throws SQLException;
	public void updateUserDetails(User user) throws SQLException;
	public void deleteUser(int id) throws SQLException;
}
