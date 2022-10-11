package com.cybage.service;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.cybage.model.Booking;
import com.cybage.repository.BookingRepository;
 
@Service
@Transactional
public class BookingService {
     
    @Autowired
    private BookingRepository bookingRepository;
     
    public List<Booking> listAllBooking() {
        return bookingRepository.findAll(Sort.by("totalAmount").ascending());
    }
     
}