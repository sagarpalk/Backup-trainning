package com.cybage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.exception.CustomException;
import com.cybage.model.Offer;
import com.cybage.model.User;
import com.cybage.repositories.OfferRepository;
import com.cybage.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public void addUser(User user) {
		System.out.println(user);
		userRepository.save(user);
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public User getUserById(int id) {
		userRepository.findById(id);
		return userRepository.getById(id);
	}

//	public User findUserByEmailAndPassword(String email, String password) throws CustomException {
//		User user = findByUserEmail(email);
//		if (user == null) {
//			throw new CustomException("user is not found");
//		}
//		if (user.getUserEmail().equals(email) && user.getPassword().equals(password)) {
//			return user;
//		}
//		return null;
//	}
//
//	public User findByUserEmail(String email) {
//		if (userRepository.findUserByEmail(email) == null) {
//			return null;
//		} else {
//			return userRepository.findUserByEmail(email);
//		}
//	}
}
