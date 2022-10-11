package com.cybage.dao;

import com.cybage.model.Flight;

public interface IFlightDao {
 Flight getFlightById(int flight_No);
 Flight getAllBooking(int booking_id);
 Flight bookFlight(int flight_No);
 
}
