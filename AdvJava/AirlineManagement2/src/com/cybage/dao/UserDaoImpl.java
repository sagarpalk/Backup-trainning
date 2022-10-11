package com.cybage.dao;

import static utility.JDBCUtility.getConncetion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cybage.model.User;

public class UserDaoImpl {
	//private Connection cn;
	public User registerUser(User user)throws SQLException, ClassNotFoundException{
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root", "root");
				 try {
						PreparedStatement preparedStatement=  connection.prepareStatement("INSERT INTO user" + "(userId,name,email,password,phoneNo,role) values" + " (?,?,?,?,?,?) ");
						preparedStatement.setString(1, user.getUserId());
						preparedStatement.setString(2, user.getName());
						preparedStatement.setString(3, user.getEmail());
						preparedStatement.setString(4, user.getPassword());
						preparedStatement.setString(5, user.getPhoneNo());
						preparedStatement.setString(6, user.getRole());
						System.out.println("PreparedStatement"+ preparedStatement);
						preparedStatement.executeUpdate();
					     ResultSet resultSet=preparedStatement.executeQuery();
				 }catch (SQLException e) {
					e.printStackTrace();
				}
		return user;
	}
}
				
				
			/*	
				String INSERT="INSERT INTO user" + "(userId,name,email,password,phoneNo,role) values" + " (?,?,?,?,?,?) ";
	int result=0;
	Class.forName("com.mysql.cj.jdbc.Driver");
	try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root", "root")){
		cn=getConncetion();
			
			PreparedStatement preparedStatement=connection.prepareStatement(INSERT);
					preparedStatement.setString(1, user.getUserId());
					preparedStatement.setString(2, user.getName());
					preparedStatement.setString(3, user.getEmail());
					preparedStatement.setString(4, user.getPassword());
					preparedStatement.setString(5, user.getPhoneNo());
					preparedStatement.setString(6, user.getRole());
					System.out.println("PreparedStatement"+ preparedStatement);
					result=preparedStatement.executeUpdate();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return result;
  	
	
	}*/
				 
