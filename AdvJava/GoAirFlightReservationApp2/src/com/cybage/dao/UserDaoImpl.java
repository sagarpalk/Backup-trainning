package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cybage.model.Login;
import com.cybage.model.User;
import com.cybage.util.JDBCUtility;


public class UserDaoImpl implements IUserDao {
	Connection connection = JDBCUtility.getConncetion();
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;
	User user = null;

	@Override
	public boolean validate(Login login) throws SQLException {
		boolean status = false;
		String sql = "select * from user where user_email=? and user_password=?";
		PreparedStatement pst;
		try {
			pst = connection.prepareStatement(sql);
			pst.setString(1, login.getLogin_id());
			pst.setString(2, login.getLogin_password());
			System.out.println(login.getLogin_id()+" "+login.getLogin_password());

		ResultSet rs = pst.executeQuery();
		
		while (rs.next()) {
			String userEmail = rs.getString(3);
			String userPassword = rs.getString(4);
			

		}
		String userEmail = rs.getString(3);
		String userPassword = rs.getString(4);
		System.out.println("user"+userEmail +"userpass"+userPassword);
		if(userEmail.equals("admin@gmail.com") && userPassword.equals("admin"))
		{
			System.out.println("in true");
			status=true;
		}
		else
			status=false;
		
			//status=pst.execute();
			
		//	status = rs.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
		
	}

	@Override
	public User getUser(int user_id) {

		try {
			preparedStatement = connection.prepareStatement(" select *from user where user_id=?;");
			preparedStatement.setInt(1, user_id);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int user_id1 = resultSet.getInt(1);
				int user_age = resultSet.getInt(7);
				String user_name = resultSet.getString(2);
				String user_email = resultSet.getString(3);
				String user_password = resultSet.getString(4);
				String user_contact = resultSet.getString(5);
				String user_address = resultSet.getString(6);
				String user_gender = resultSet.getString(8);
				String user_role = resultSet.getString(9);

				user = new User(user_id1, user_age, user_name, user_email, user_password, user_contact, user_address,
						user_gender, user_role);

			}
			connection.close();
			return user;

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;

	}

	@Override
	public User getUser(Login login) {
		try {
			preparedStatement = connection
					.prepareStatement("select * from user where user_email=? and user_password=? ");
			preparedStatement.setString(1, login.getLogin_id());
			preparedStatement.setString(2, login.getLogin_password());
			User user = null;

			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int user_id1 = resultSet.getInt(1);
				int user_age = resultSet.getInt(7);
				String user_name = resultSet.getString(2);
				String user_email = resultSet.getString(3);
				String user_password = resultSet.getString(4);
				String user_contact = resultSet.getString(5);
				String user_address = resultSet.getString(6);
				String user_gender = resultSet.getString(8);
				String user_role = resultSet.getString(9);

				user = new User(user_id1, user_age, user_name, user_email, user_password, user_contact, user_address,
						user_gender, user_role);

			}
			System.out.println("hellloooooo:" + user);
			// connection.close();
			return user;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override

	public boolean addUser(User user) {
		try {
			preparedStatement = connection.prepareStatement("insert into"
					+ " user(user_name,user_email,user_password,user_contact,user_address,user_age,user_gender,user_role)"
					+ " values(?,?,?,?,?,?,?,?)");
			
			preparedStatement.setString(1, user.getUser_name());
			preparedStatement.setString(2, user.getUser_email());
			preparedStatement.setString(3, user.getUser_password());
			preparedStatement.setString(4, user.getUser_contact());
			preparedStatement.setString(5, user.getUser_address());
			preparedStatement.setInt(6, user.getUser_age());
			preparedStatement.setString(7, user.getUser_gender());
			preparedStatement.setString(8, "user");

			preparedStatement.execute();

			// connection.close();
			System.out.println("User inserted successfully");
			return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("User Already exists.....");

		}

		return false;

	}
}
