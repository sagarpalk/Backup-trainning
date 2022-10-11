package com.cybage.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.service.AdminServiceImpl;
import com.cybage.service.IAdminService;

/**
 * Servlet implementation class DeleteFlightController
 */
@WebServlet("/DeleteFlightController")
public class DeleteFlightController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteFlightController() {
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
		int flightNo = Integer.parseInt(request.getParameter("flight_No"));
		IAdminService adminService = new AdminServiceImpl();
		adminService.deleteFlightById(flightNo);
		System.out.println("Flight deleted Successfully!");
	}

}
