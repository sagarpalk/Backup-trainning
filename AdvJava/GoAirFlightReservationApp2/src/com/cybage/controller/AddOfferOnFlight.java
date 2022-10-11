package com.cybage.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cybage.model.Offer;
import com.cybage.service.AdminServiceImpl;
import com.cybage.service.IAdminService;
import com.cybage.service.IOfferService;
import com.cybage.service.OfferServiceImpl;

/**
 * Servlet implementation class AddOfferOnFlight
 */
@WebServlet("/addOffer")
public class AddOfferOnFlight extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddOfferOnFlight() {
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
		session.setAttribute("flight", "You have added Offers On flight!!!!!");
		int offerId=Integer.parseInt(request.getParameter("offer_id"));
		String OfferName = request.getParameter("add_offer_name");
		int OfferRate = Integer.parseInt(request.getParameter("add_offer_rate"));

		Offer offer = new Offer(offerId,OfferName, OfferRate);

		System.out.println(offer);
		IOfferService offerService = new OfferServiceImpl();
		try {
			offerService.addNewOffer(offer);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
