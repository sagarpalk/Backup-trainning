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
import com.cybage.service.AdminServiceImpl;
import com.cybage.service.IAdminService;

/**
 * Servlet implementation class AddFlight
 */
@WebServlet("/AddFlight")
public class InsertFlightController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InsertFlightController() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.setAttribute("flight", "You have added flight ddetails");

		int flightNo = Integer.parseInt(request.getParameter("flight_No"));
		int totalSeats = Integer.parseInt(request.getParameter("flight_total_no_seats"));
		int avaliableSeats = Integer.parseInt(request.getParameter("flight_avaliable_seats"));
		int flightPrice = Integer.parseInt(request.getParameter("Flight_price"));
		String flightName = request.getParameter("Flight_name");
		String flightSource = request.getParameter("flight_source");
		String flightDestination = request.getParameter("flight_destination");
		String flightType = request.getParameter("flight_type");
		Time flightTime = new Time(12, 20, 30);
		 String flightDate=request.getParameter("flight_date");
		java.util.Date date1 = null;
		try {
			date1 = new SimpleDateFormat("MM-dd-yyyy").parse(request.getParameter("paymentDueDate"));
		} catch (ParseException e) {

			e.printStackTrace();
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String myStringdate = sdf.format(date1);
		Date finishedDate = null;
		try {
			finishedDate = (Date) sdf.parse(myStringdate);
		} catch (ParseException e) {

			e.printStackTrace();
		}
		Flight flight = new Flight(flightNo, totalSeats, avaliableSeats, flightPrice, flightName,
				flightSource, flightDestination, flightType, flightTime, finishedDate);

		IAdminService adminService = new AdminServiceImpl();
		adminService.addFlight(flight);
		

	}
}
