package com.cybage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.model.Customer;
import com.cybage.model.Flight;
import com.cybage.model.User;
import com.cybage.repositories.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;

	public void addCustomer(Customer customer) {
		System.out.println(customer);
		customerRepository.save(customer);
	}

	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	public Customer getById(int id) {
		customerRepository.findById(id);
		return customerRepository.getById(id);
	}

	public void removeCustomers(Customer customer) {
		customerRepository.delete(customer);
		System.out.println("Record deleted from Database");
	}
	
	public void updateCustomer(Customer customer) {
		customerRepository.save(customer);
	}

//	public Customer getCustomerByEmailAndPassword(String userEmail,String password) {
//		return customerRepository.findCustomerByEmailAndPassword(userEmail,password);
//	}
//
//	public Customer findByEmail(String userEmail) {
//		if (customerRepository.findCustomerByEmail(userEmail) == null) {
//			return null;
//		} else {
//			return customerRepository.findCustomerByEmail(userEmail);
//		}
//	}
	
	
	public List<Customer> getCustomerByEmailAndPass(String userEmail,String password) {
		return customerRepository.findCustomerByUserEmailAndPassword(userEmail, password);
	}
	
	
	
	
	
	
	
	
	
	
}
