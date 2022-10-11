package com.cybage.controller;

import java.io.IOException;
import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cybage.model.Flight;
import com.cybage.service.IAdminServiceImpl;
import com.cybage.service.AdminServiceImpl;

/**
 * Servlet implementation class AddFlightController2
 */
@WebServlet("/AddFlightController2")
public class AddFlightController2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddFlightController2() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int flightNo = Integer.parseInt(request.getParameter("flight_No"));
		int totalSeats = Integer.parseInt(request.getParameter("flight_total_no_seats"));
		int flightAvaliableSeats = Integer.parseInt(request.getParameter("flight_avaliable_seats"));
		int flightPrice = Integer.parseInt(request.getParameter("economicPrice"));
		String FlightName = request.getParameter("flight_name");
		String flightSource = request.getParameter("flight_source");
		String flightDestination = request.getParameter("flight_destination");
		String flightType = request.getParameter("flight_type");
		String flight_time=request.getParameter("flight_time");
		Time flightTime=new Time(12, 20,30);
		

		Date flightDate = new Date(2022 - 04 - 06);
		// String flight_date=request.getParameter("flight_date");
		// Date date=null;

		Flight flight = new Flight(flightNo, totalSeats, flightAvaliableSeats, flightPrice, FlightName, flightSource,
				flightDestination, flightType, flightTime, flightDate);

		System.out.println(flight);
		IAdminServiceImpl adminService = new AdminServiceImpl();
		adminService.addFlight(flight);
		
		

	}

}
