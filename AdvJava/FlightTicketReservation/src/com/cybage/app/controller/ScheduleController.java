//package com.cybage.app.controller;
//
//import java.io.IOException;
//import java.sql.SQLException;
//import java.text.ParseException;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import com.cybage.app.model.Flight_Schedule;
//import com.cybage.app.service.FlightScheduleServiceImpl;
//
//
//@WebServlet("/ScheduleFlight")
//public class ScheduleController extends HttpServlet {
//	private static final long serialVersionUID = 1L;
// 
//    public ScheduleController() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//			
//			FlightScheduleServiceImpl scheduleFlight=new FlightScheduleServiceImpl();
//			String flightid=request.getParameter("flight_id");
//			int flight_id=Integer.valueOf(flightid);
//			String arrivalDate=request.getParameter("flight_arrival_date");
//			String arrivalTime=request.getParameter("flight_arrival_time");
//			String departureDate=request.getParameter("flight_departure_date");
//			String departureTime=request.getParameter("flight_departure_time");
//			String stoptype=request.getParameter("flight_stop_types");
//			String flightrouteid=request.getParameter("flight_routeid");
//			int flight_route_id=Integer.valueOf(flightrouteid);
//			String flightofferid=request.getParameter("flight_offerid");
//			int flight_offerid=Integer.valueOf(flightofferid);
//			String availibilitystatus=request.getParameter("flight_availibility_status");
//			System.out.println("flight_id:-"+flight_id+" flight_route_id:-"+flight_route_id+":-"+flight_route_id+" flight_offerid"+flight_offerid);
//			Flight_Schedule schedule=new Flight_Schedule(arrivalDate,departureDate,arrivalTime,departureTime,stoptype,availibilitystatus,flight_id,flight_route_id,flight_offerid);
//			try {
//			scheduleFlight.schduleFLight(schedule);
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//			e.printStackTrace();
//			} catch (ParseException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//
//}
