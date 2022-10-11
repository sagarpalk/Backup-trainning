package com.cybage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybage.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

//	public User saveUser(User user);	
//	public List<User> findAllUsers();
//	User findUserByEmailAndPassword(String email, String password);
//
//	// findFlightByFlightSourceAndDestination
//	User findUserByEmail(String email);

}
