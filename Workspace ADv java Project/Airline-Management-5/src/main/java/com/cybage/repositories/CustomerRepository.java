package com.cybage.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybage.model.Customer;
import com.cybage.model.Flight;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
//	
//	public Customer findCustomerByEmailAndPassword(String userEmail,String password);
//	 
//	public Customer findCustomerByEmail(String userEmail);
//	
	// List<Tutorial>findByDescription(String description,String tutorialName);
	
	
	
	
	public List<Customer> findCustomerByUserEmailAndPassword(String userEmail, String password);
}
