package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import static utility.JDBCUtility.getConncetion;

import com.cybage.model.User;
import com.cybage.dao.*;
import com.mysql.cj.protocol.Resultset;

public class UserDaoImpl implements IUserDao {
	private Connection cn;
	private PreparedStatement pst1, pst2;
	
	private String name = "Sagar";

	

	public UserDaoImpl(String name) {
		super();
		this.name = name;
	}

	public UserDaoImpl() throws SQLException {
		cn = getConncetion();
		pst1 = cn.prepareStatement("select * from user where email=? and password=?");
		pst2 = cn.prepareStatement("UPDATE user SET password=? where email=? and password=?");
		System.out.println("User Dao created");
	}

	@Override
	public User authenticateUser(String email, String password) throws SQLException {
		System.out.println("demo11");
		pst1.setString(1, email);
		pst1.setString(2, password);
		try (ResultSet rst = pst1.executeQuery()) {
			if (rst.next())
				return new User(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getInt(5),
						rst.getString(6));
		}
		return null;

	}

	@Override
	public User getSelectedUsersDetails(String email, String password) throws SQLException {

		User user = null;

		// set IN params
		pst1.setString(1, email);
		pst1.setString(2, password);

		// exec query
		try (ResultSet rst = pst1.executeQuery()) {
			if (rst.next())
				// userId, String name, String email, String password, double regAmount, Date
				// regDate, String role
				return new User(rst.getInt(1), rst.getString(2), email, password, rst.getInt(5), rst.getString(6));
		}
		return null;

	}

	public boolean changePassword(String email, String password, String newPassword) throws SQLException {
		User user1 = null;

		// set IN params
		pst2.setString(1, newPassword);
		pst2.setString(2, email);
		pst2.setString(3, password);

		int n = pst2.executeUpdate();
		if (n > 0) {
			// System.out.println("Password updated!!.");
			return true;
		} else {
			// System.out.println(Oooopss Invalid Login!!");
			return false;
		}

	}

	public void cleanUp() throws SQLException {
		if (pst1 != null)
			pst1.close();
		System.out.println();

	}

	@Override
	public User getUserDeatils(String email, String password) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
