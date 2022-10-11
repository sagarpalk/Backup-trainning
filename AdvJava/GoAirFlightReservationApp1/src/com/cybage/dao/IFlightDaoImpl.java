package com.cybage.dao;

import com.cybage.model.Flight;

public interface IFlightDaoImpl {
 Flight getFlightById(int flight_No);
 Flight getAllBooking(int booking_id);
 Flight bookFlight(int flight_No);
 
}
