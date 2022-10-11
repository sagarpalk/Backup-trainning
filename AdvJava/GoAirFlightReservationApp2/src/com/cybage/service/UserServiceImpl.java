package com.cybage.service;

import java.sql.SQLException;

import com.cybage.dao.IUserDao;
import com.cybage.dao.UserDaoImpl;
import com.cybage.model.Login;
import com.cybage.model.User;

public class UserServiceImpl implements IUserService{
	IUserDao userDao= new UserDaoImpl();
	@Override
	public User getUserById(int user_id) {

		return userDao.getUser(user_id);
	}

	@Override
	public boolean validate(Login login) throws SQLException {
		return userDao.validate(login);
	}
	@Override
	public User getUser(Login login) {
		return userDao.getUser(login);
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return userDao.addUser(user);
	}

	

}
