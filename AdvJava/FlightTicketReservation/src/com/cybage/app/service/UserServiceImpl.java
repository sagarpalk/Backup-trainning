package com.cybage.app.service;

import java.sql.SQLException;

import com.cybage.app.dao.UserDaoImpl;
import com.cybage.app.model.LoginBean;
import com.cybage.app.model.User;

public class UserServiceImpl implements UserService {
	UserDaoImpl userDaoImpl = new UserDaoImpl();
	@Override
	public void registerUser(User user) throws SQLException {
		userDaoImpl.registerUser(user);

	}

	@Override
	public boolean validate(LoginBean loginBean) throws SQLException {
		
		return userDaoImpl.validate(loginBean);
	}

	@Override
	public void displayAllUsers() throws SQLException {
		userDaoImpl.displayAllUsers();

	}

	@Override
	public void deleteUser(int id) throws SQLException {
		userDaoImpl.deleteUser(id);

	}

	@Override
	public void updateUserDetails(User user) throws SQLException {
		userDaoImpl.updateUserDetails(user);

	}

}
