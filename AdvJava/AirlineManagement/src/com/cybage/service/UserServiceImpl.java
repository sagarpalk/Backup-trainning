package com.cybage.service;

import static utility.JDBCUtility.getConncetion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cybage.dao.IUserDao;
import com.cybage.dao.UserDaoImpl;
import com.cybage.model.User;


public class UserServiceImpl implements IUserService {
	
	private IUserDao userDao = new UserDaoImpl("Sagar");

	@Override
	public User authenticateUser(String email, String password) throws SQLException {
		return userDao.authenticateUser(email, password);
	}

	@Override
	public boolean changePassword(String email, String password, String new_password) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getUserDeatils(String email, String password) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getSelectedUsersDetails(String email, String password) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	

}
