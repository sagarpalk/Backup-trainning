package com.cybage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.exception.CustomException;
import com.cybage.model.User;
import com.cybage.service.UserService;

@RestController
@RequestMapping("/airline-management")
public class UserController {
	@Autowired
	private UserService userService;


	@PostMapping("/register")
	public ResponseEntity<String> saveUser(@RequestBody User user) {
		userService.addUser(user);
		return new ResponseEntity<String>("User Record added successfully", HttpStatus.CREATED);
	}

	
	@GetMapping("/allUser")
	public ResponseEntity<List<User>> getAllUser() {
		System.out.println("vishal1");
		List<User> list =userService.getAllUsers();
		System.out.println("vishal2");
		return new ResponseEntity<List<User>>(list, HttpStatus.OK);
	}
	
	
//	@PostMapping("/login")
//	public ResponseEntity<String> login(@RequestBody User user) throws CustomException{
//		System.out.println("sagar123");
//		User userLogin = userService.findUserByEmailAndPassword(user.getUserEmail(), user.getPassword());
//		
//		if(user.getUserEmail().equals("admin") && user.getPassword().equals("admin")) {
//			System.out.println("Hello");
//			return new ResponseEntity<>("Admin logged in...", HttpStatus.OK);
//		}else if(userLogin == null) {
//			System.out.println("Email is wrong");
//			return new ResponseEntity<>("Email or password is wrong", HttpStatus.NOT_FOUND);
//		}else  {
//			System.out.println("prash");			
//			return new ResponseEntity<>(HttpStatus.OK);			
//		}	
		
	} 
	



