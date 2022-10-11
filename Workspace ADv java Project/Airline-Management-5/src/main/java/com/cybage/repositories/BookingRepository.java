package com.cybage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybage.model.Booking;


@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer>{

}
