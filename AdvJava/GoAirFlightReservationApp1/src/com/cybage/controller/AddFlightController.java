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
import com.cybage.service.IAdminServiceImpl;



/**
 * Servlet implementation class AddFlight
 */
@WebServlet("/AddFlight")
public class AddFlightController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddFlightController() {
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
		HttpSession session=request.getSession();
		session.setAttribute("flight", "You have added flight ddetails");
		
		int flight_No=Integer.parseInt(request.getParameter("flight_No"))	;
		int flight_total_no_seats=Integer.parseInt(request.getParameter("flight_total_no_seats"))	;
		int flight_avaliable_seats=Integer.parseInt(request.getParameter("flight_avaliable_seats"))	;
		int flight_price=Integer.parseInt(request.getParameter("Flight_price"))	;
		String flight_name=request.getParameter("Flight_name");
		String flight_source=request.getParameter("flight_source");
		String flight_destination=request.getParameter("flight_destination");
		String flight_type=request.getParameter("flight_type");
		
		
	//	String flight_time=request.getParameter("flight_type");
		Time flight_time=new Time(12, 20,30);
		//String flight_date=request.getParameter("flight_date");
	

		
		 java.util.Date date1 = null;
		try {
			date1 = new SimpleDateFormat("MM-dd-yyyy").parse(request.getParameter("paymentDueDate"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	        // 2)Create a new DateFormat("yyyy-MM-dd") - For mySQL format
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	        // 3)Convert my Date obj into String, and change to ("yyyy-MM-dd") format

	        String myStringdate = sdf.format(date1);

	        // 4)Convert String back to date obj

	        Date finishedDate = null;
			try {
				finishedDate = (Date)sdf.parse(myStringdate);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	    
		
		
		Flight flight=new Flight(flight_No, flight_total_no_seats, flight_avaliable_seats, flight_price, flight_name, flight_source, flight_destination, flight_type, flight_time, finishedDate);
			
		
			IAdminServiceImpl adminService=new AdminServiceImpl();
			adminService.addFlight(flight);;
		
		}
	}


