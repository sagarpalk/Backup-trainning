package com.cybage.service;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.cybage.model.Flight;
import com.cybage.repository.FlightRepository;
 
@Service
@Transactional
public class FlightService {
     
    @Autowired
    private FlightRepository flightRepository;
    
    public List<Flight> listAllFlight() {
        return flightRepository.findAll(Sort.by("flightName").ascending());
    }
     
     
}