package com.cybage.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.model.BookTicketFlight;
import com.cybage.model.Flight;
import com.cybage.service.BookingServiceImpl;
import com.cybage.service.FlightServiceImpl;
import com.cybage.service.IBookingServiceImpl;
import com.cybage.service.IFlightServiceImpl;

/**
 * Servlet implementation class TicketBookingController
 */
@WebServlet("/TicketBookingController")
public class TicketBookingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	FlightServiceImpl flightService = new FlightServiceImpl();
//	RequestDispatcher requestDispatcher;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TicketBookingController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int flight_No = Integer.parseInt(request.getParameter("flight_No")); 
		System.out.println(flight_No);
		System.out.println("sagar1");
		Flight flight = flightService.bookFlight(flight_No);
		System.out.println(flight);
		System.out.println("fLIGHT BOOKING");
		
		List<Flight> flights = new ArrayList<Flight>();
		flights.add(flight);
//		request.getRequestDispatcher("confirmBooking.jsp");
//		requestDispatcher.forward(request, response);
		request.setAttribute("flights", flights);
		System.out.println("sagar10");
		System.out.println(flights);
		RequestDispatcher dispatcher = request.getRequestDispatcher("confirmBooking.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		 int flightNo = Integer.parseInt(request.getParameter("flight_No")); 
		String departure_date=request.getParameter("flight_date");
		String flight_time=request.getParameter("flight_time");
		 String flightClass=request.getParameter("flights_class_name");
		  int flightPrice = Integer.parseInt(request.getParameter("price"));
		  int noOfSeats = Integer.parseInt(request.getParameter("no_of_seats")); 
		 
		 
		System.out.println(flightNo);
		System.out.println(departure_date);
		System.out.println(flight_time);
		System.out.println(flightClass);
		System.out.println(flightPrice);
		System.out.println(noOfSeats);
		BookTicketFlight b1 = new BookTicketFlight(5, "5/5/2022", "10.25pm", "flightClass", 565, 2);
		System.out.println(b1);
		BookTicketFlight b = new BookTicketFlight(flightNo, departure_date, flight_time, flightClass, flightPrice, noOfSeats);
		System.out.println(b);
		//int booking_id = 20;
		//int user_id = 10;
		
//
		IFlightServiceImpl flightService = new FlightServiceImpl();
		Flight flight = flightService.bookFlight(flightNo);

		//IUserServiceImpl userService = new UserServiceImpl();
		//User user = userService.getUserById(user_id);
//		System.out.println(user);
		
		System.out.println("From ticket controller");


		IBookingServiceImpl bookingService = new BookingServiceImpl();
//		bookingService.addBooking(booking_obj);

		response.sendRedirect("ConfirmTicket.jsp");

	}

}
