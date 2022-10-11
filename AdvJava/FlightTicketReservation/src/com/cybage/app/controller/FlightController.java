package com.cybage.app.controller;

import java.io.IOException;

import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.app.dao.FlightDaoImpl;
import com.cybage.app.model.Flight;
import com.cybage.app.model.Flight_Route;
import com.cybage.app.model.SeatPrice;
import com.cybage.app.service.FlightServiceImpl;

/**
 * Servlet implementation class FlightController
 */
@WebServlet("/FlightController")
public class FlightController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FlightController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get parameters
		String f_name=request.getParameter("flight_name");
		String f_service_provider=request.getParameter("flight_service_provider");
		String f_tpye=request.getParameter("flight_type");
		String f_economicseats=request.getParameter("economic_seats");
		String f_premiumseats=request.getParameter("premium_seats");
		String f_businessseats=request.getParameter("business_seats");
		String ecoPrice= request.getParameter("economicPrice");
		String premPrice= request.getParameter("premiumPrice");
		String busPrice= request.getParameter("businessPrice");
		String source=request.getParameter("flight_source");
		String destination=request.getParameter("flight_destination");
		//convert String to integer for number of seats
		int economic_seats=Integer.parseInt(f_economicseats);
		int premium_seats=Integer.parseInt(f_premiumseats);
		int business_seats=Integer.parseInt(f_businessseats);
		//convert string to duoble for price of seats
		double economicPrice=Double.parseDouble(ecoPrice);
		double premiumPrice=Double.parseDouble(premPrice);
		double businessPrice=Double.parseDouble(busPrice);
		//instatiate flight pojo
		Flight newFlight=new Flight(f_name,f_service_provider,f_tpye,economic_seats,premium_seats,business_seats);
		//instantiate SeatPrice pojo
		SeatPrice price= new SeatPrice(economicPrice,premiumPrice,businessPrice);
		//instantiate Flight_Route pojo
		Flight_Route flight_route= new Flight_Route(source,destination);
		//instantiate FlightServceImpl class
		FlightServiceImpl newService= new FlightServiceImpl();
		try {
			//call addNewFlight() service layer method
			newService.addNewFlight(newFlight);
			//call addSeatPrice()service layer method
			newService.addSeatPrice(price);
			//calll addNewFlight() service layer method
			newService.addFlightRoute(flight_route);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
