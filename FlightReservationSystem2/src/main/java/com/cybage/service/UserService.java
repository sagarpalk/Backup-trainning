package com.cybage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.dtos.LoginUserDto;

import com.cybage.model.Passenger;
import com.cybage.model.User;
import com.cybage.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	public User getById(int id) {
		// TODO Auto-generated method stub
		return userRepository.getById(id);
	}

	public void removeUser(User user) {
		// TODO Auto-generated method stub
		userRepository.delete(user);
		System.out.println("USER DELETED SUCCESSFULLY FROM DATABASE");
	}

	public void addUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}


	
}
