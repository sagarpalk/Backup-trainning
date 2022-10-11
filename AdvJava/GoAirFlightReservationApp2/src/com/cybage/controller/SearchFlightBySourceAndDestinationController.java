package com.cybage.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SearchFlightBySourceAndDestinationController
 */
@WebServlet("/SearchFlightBySourceAndDestinationController")
public class SearchFlightBySourceAndDestinationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchFlightBySourceAndDestinationController() {
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
		String option_source=request.getParameter("flights_select_source");
		String option_destination=request.getParameter("flights_select_destination");
		System.out.println(option_source+" "+option_destination);
		  HttpSession session = request.getSession();
		  session.setAttribute("flights_select_source", option_source);
		  session.setAttribute("flights_select_destination", option_destination);
		  response.sendRedirect("bookFlight.jsp");
		   
	
	}

}
