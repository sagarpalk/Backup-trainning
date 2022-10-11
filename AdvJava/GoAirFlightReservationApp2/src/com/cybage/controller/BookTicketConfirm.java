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
import javax.servlet.http.HttpSession;

import com.cybage.model.BookTicketFlight;
import com.cybage.model.Booking;
import com.cybage.model.Flight;
import com.cybage.service.BookingServiceImpl;
import com.cybage.service.FlightServiceImpl;
import com.cybage.service.IBookingService;
import com.cybage.service.IFlightService;

/**
 * Servlet implementation class TicketBookingController
 */
@WebServlet("/BookTicketConfirm")
public class BookTicketConfirm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	FlightServiceImpl flightService = new FlightServiceImpl();
	BookingServiceImpl bookingService = new BookingServiceImpl();
//	RequestDispatcher requestDispatcher;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BookTicketConfirm() {
		super();
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
		System.out.println("flight BOOKING confirm!!!!!!!!");

		Booking book1 = new Booking(flight, flight.getFlight_type(), true);
		System.out.println("sagar1");
		System.out.println(book1);
		bookingService.addBooking(book1);
		System.out.println("sagar2");

		RequestDispatcher dispatcher = request.getRequestDispatcher("bookSuccess.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
