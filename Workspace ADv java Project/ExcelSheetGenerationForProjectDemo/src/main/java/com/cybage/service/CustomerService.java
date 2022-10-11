package com.cybage.service;


import java.util.List;
 
import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.cybage.model.Customer;
import com.cybage.model.User;
import com.cybage.repository.CustomerRepository;
 
@Service
@Transactional
public class CustomerService {
     
    @Autowired
    private CustomerRepository customerRepository;
     
    public List<Customer> listAllCustomer() {
        return customerRepository.findAll(Sort.by("userEmail").ascending());
    }
     
}