package com.cybage.app.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cybage.app.model.LoginBean;
import com.cybage.app.model.User;


public class UserDaoImpl implements UserDao {

	Connection connection=com.cybage.app.utilities.JDBCconnectivity.getConnection();
	User user = new User();
	@Override
	public int registerUser(User user) throws SQLException {
		 String INSERT_USERS_DATA = "INSERT INTO user" +
		            "  (u_firstname, u_lastname, u_email, u_password, u_role) VALUES " +
		            " (?, ?, ?, ?,?);";

		        int result = 0;

		      

		        try {
		        	 PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_DATA);
		            preparedStatement.setString(1, user.getFirstName());
		            preparedStatement.setString(2, user.getLastName());
		            preparedStatement.setString(3, user.getEmail());
		            preparedStatement.setString(4, user.getPassword());
		            preparedStatement.setString(5, user.getRole());

		            System.out.println(preparedStatement);
		            // Step 3: Execute the query or update query
		            result = preparedStatement.executeUpdate();

		        } catch (SQLException e) {
		            // process sql exception
		            e.printStackTrace();
		        return result;
		    }
				return result;
	}

	@Override
	public boolean validate(LoginBean loginBean) throws SQLException {
		boolean status=false;
		String sql = "select * from user where u_email=? and u_password=?";
		PreparedStatement pst;
		try {
			pst = connection.prepareStatement(sql);
			pst.setString(1, loginBean.getEmail());
			pst.setString(2, loginBean.getPassword());
			
			ResultSet rs =  pst.executeQuery();
			status = rs.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<User> displayAllUsers() throws SQLException {
		 List<User> userList = new ArrayList<>();
	        
	       String sql = "SELECT * FROM user";
	       
	       PreparedStatement pst = connection.prepareStatement(sql);
	       ResultSet resultSet = pst.executeQuery();
	        
	       while (resultSet.next()) {
	         int id =  resultSet.getInt("u_userid");
	         String firstName = resultSet.getString("u_firstname");
	         String lastName = resultSet.getString("u_lastname");
	         String email = resultSet.getString("u_email");
	         User user = new User(id, firstName, lastName, email);
	         userList.add(user);
	       }
	 
	       return userList;
	}

	@Override
	public void updateUserDetails(User user) throws SQLException {
PreparedStatement pst1=connection.prepareStatement("update user set u_firstname=?, u_lastname=?, u_password=? where u_userid=?");
		
		pst1.setString(1,user.getFirstName());
		pst1.setString(2,user.getLastName());
		pst1.setString(3,user.getPassword());
		pst1.setInt(4, user.getId());
		pst1.executeUpdate();
		
	}

	@Override
	public void deleteUser(int id) throws SQLException {
		PreparedStatement pst2=connection.prepareStatement("delete from user where u_userid=?");
		pst2.setInt(1, id);
		pst2.executeUpdate();

	}

}
