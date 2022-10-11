package com.cybage.service;

import java.sql.SQLException;

import com.cybage.model.Login;
import com.cybage.model.User;

public interface IUserServiceImpl {

	User getUserById(int user_id);

	public User getUser(Login login);

	public boolean addUser(User user);

	boolean validate(Login login) throws SQLException;

}
