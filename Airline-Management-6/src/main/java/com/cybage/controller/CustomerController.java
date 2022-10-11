package com.cybage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.model.Customer;
import com.cybage.model.Flight;
import com.cybage.service.CustomerService;

@CrossOrigin("*")
@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/register")
	public ResponseEntity<?> addCustomer(@RequestBody Customer customer) {
		
		customerService.addCustomer(customer);
		System.out.println(customer);
		return new ResponseEntity<>("Record added successfully", HttpStatus.ACCEPTED);
	}

	@GetMapping("/getAllCustomer")
	public ResponseEntity<List<Customer>> getAllCustomer() {
		System.out.println("Hello");
		return new ResponseEntity<List<Customer>>(customerService.getAllCustomers(), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable int id) {
		Customer index = customerService.getById(id);
		customerService.removeCustomers(index);
		return new ResponseEntity<String>("Record deleted successfully", HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable int id) {
		Customer customer = customerService.getById(id);

		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<String> updateCustomer(@RequestBody Customer customer) {
		customerService.updateCustomer(customer);
		return new ResponseEntity<String>("Customer Record updated successfully", HttpStatus.CREATED);
	}

	@GetMapping("/searchCustomer/{email}/{password}")
	public ResponseEntity<List<Customer>> getUserByEmailAndPassword(@PathVariable String userEmail,
			@PathVariable String password) {
		return new ResponseEntity<List<Customer>>(customerService.getCustomerByEmailAndPass(userEmail, password),
				HttpStatus.OK);

//	
//	@GetMapping("/getCustomerByEmail/{email}")
//	public ResponseEntity<String> findCustByEmailAndPass(@PathVariable String email){
//		Customer customer = customerService.findByEmail(email);
//		return new ResponseEntity<String>(HttpStatus.CREATED);
//	}

	}
}
