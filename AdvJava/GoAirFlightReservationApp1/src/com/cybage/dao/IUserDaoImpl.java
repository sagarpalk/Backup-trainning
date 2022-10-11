package com.cybage.dao;

import java.sql.SQLException;


import com.cybage.model.Login;
import com.cybage.model.User;

public interface IUserDaoImpl {
   User getUser(int user_id); 
   public User getUser(Login login);
	public boolean validate(Login login) throws SQLException;
  	public boolean addUser(User user);
}
