package com.cybage.app.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cybage.app.dao.ComplaintDaoImpl;
import com.cybage.app.dao.FeedbackDaoImpl;
import com.cybage.app.dao.OfferDao;
import com.cybage.app.dao.OfferDaoImpl;
import com.cybage.app.model.BookingInfo;
import com.cybage.app.model.Complaint;
import com.cybage.app.model.Feedback;
import com.cybage.app.model.Flight_Schedule;
import com.cybage.app.model.Offer;
import com.cybage.app.service.BookTicketServiceImpl;
import com.cybage.app.service.BookingInfoServiceImpl;
import com.cybage.app.service.ComplaintDao;
import com.cybage.app.service.FeedbackDao;
import com.cybage.app.service.FlightScheduleServiceImpl;
import com.cybage.app.service.OfferService;
import com.cybage.app.service.OfferServiceImpl;

@WebServlet("/")
public class FeedbackController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private FeedbackDao feedbackDAO;
	private ComplaintDao complaintDAO;
	private OfferDao offerDao ;
	private OfferService newOfferService;

	public void init() {
		feedbackDAO = new FeedbackDaoImpl();
		complaintDAO = new ComplaintDaoImpl();
		newOfferService= new OfferServiceImpl();
		offerDao= new OfferDaoImpl();
		
		System.out.println("in the feedbackss");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();

		try {
			switch (action) {

			case "/new":
				showNewForm(request, response);
				break;

			case "/insert":
				insertFeedback(request, response);
				break;

			case "/delete":
				deleteFeedback(request, response);
				break;

			case "/edit":
				showEditForm(request, response);
				break;
			case "/edit_complaint":
				showChangeStatusForm(request, response);
				break;
			case "/update":
				updateFeedback(request, response);
				break;
			case "/update_cStatus":
				updateComplaint(request, response);
				break;		
			case "/list":
				listFeedback(request, response);
				break;
			case "/myfeedbacklist":
				myFeedbacks(request, response);
				break;
			case "/mycomplaints":
				myComplaints(request, response);
				break;
			case "/scheduleFlight":
				scheduleFlight(request, response);
				break;
			case "/clist":
				listComplaint(request, response);
				break;
			case "/cnew":
				showNewComplaintForm(request, response);
				break;
			case "/cinsert":
				insertComplaint(request, response);
				break;
			case "/myticket":
				showMyTicket(request, response);
				break;
			case "/addOffer":
				addOffer(request, response);
				break;
			case "/updateOffer":
				updateOffer(request, response);
				break;
			case "/deleteOffer":
				deleteOffer(request, response);
				break;
			case "/listOffer":
				listOffer(request, response);
				break;
			 case "/findByTicketId":
             	getTicketByTicketId(request, response);
                 break;
             case "/viewMyTickets":
             	getTicketByUserId(request, response);
                 
                 break;
                
             case "/findPassendBySchedule":
             	getPassengerDetailsBySchedule(request, response);
                 break;
                 
             case "/findBySeatType":
             	getPassengerDetailsByseatType(request, response);
                 break;
           case "/findByShift":
         	  getPassengerDetailsByShift(request, response);
         	 
               
               break;
           case "/BookTicket":
           	bookTicket(request, response);
              
               break;
             
           case "/DeleteBookedTicket":
           	deleteBookedTicket(request, response);
               
               break;
              
           case "/ViewMyTickets":
              
               break;
         
              
          
			default:
				RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
				dispatcher.forward(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}
	

	private void deleteBookedTicket(HttpServletRequest request, HttpServletResponse response) throws  SQLException, IOException, ServletException {
		System.out.println("Inside Controller");
		String ticketid=request.getParameter("ticketId");
		System.out.println(ticketid);
		  int flightticketid=Integer.parseInt(ticketid);
		BookTicketServiceImpl ticketServiceImpl=new BookTicketServiceImpl();
		try {
			ticketServiceImpl.cancelTicket(flightticketid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	 private void bookTicket(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException, ServletException {
		 
		 com.cybage.app.model.BookTicket ticket=new com.cybage.app.model.BookTicket();
			String scheduleId=request.getParameter("scheduleId");
		     String passportId=request.getParameter("passportId");
		     String classType=request.getParameter("classType");
		     String numTickets=request.getParameter("numTickets");
		     String userId=request.getParameter("userId");
		     String status=request.getParameter("status");
		     int flightscheduleId=Integer.parseInt(scheduleId);
		     int flightPassportId=Integer.parseInt(passportId);
		     int flightNumTickets=Integer.parseInt(numTickets);
		     int curentuserId =Integer.parseInt(userId);
		     ticket.setScheduleId(flightscheduleId);
		     ticket.setPassportId(flightPassportId);
		     ticket.setClassType(classType);
		     ticket.setNumTickets(flightNumTickets);
	         ticket.setStatus(status);
	         ticket.setUserId(curentuserId);
	           BookTicketServiceImpl ticketServiceImpl=new BookTicketServiceImpl();
	            try {
					
	            	ticketServiceImpl.addBookTicket(ticket);
				} catch (Exception e) {
					e.printStackTrace();
				}
	               
	            }
	private void getTicketByTicketId(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
		   int ticketId=Integer.parseInt(request.getParameter("ticketid"));
		   BookingInfoServiceImpl bookingInfoServiceImpl=new BookingInfoServiceImpl();
		   try {
			   BookingInfo bookingInfo;
			bookingInfo=bookingInfoServiceImpl.findBookinInfoById(ticketId);
			        // System.out.println("Inside Controller");
					//System.out.println(bookingInfo);
//					request.setAttribute("ticket",bookingInfo );
//					RequestDispatcher dispatcher=request.getRequestDispatcher("myTicket.jsp");
//					dispatcher.forward(request, response);
	;
		} catch (SQLException e) {
		
			e.printStackTrace();
		}	

	 
	
            }
	private void getTicketByUserId(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
		   int userId=Integer.parseInt(request.getParameter("userId"));
		   BookingInfoServiceImpl bookingInfoServiceImpl=new BookingInfoServiceImpl();
		   try {
			List<BookingInfo>bookingInfos=new ArrayList<BookingInfo>();
			bookingInfos=bookingInfoServiceImpl.getAllTicket(userId);
			 System.out.println("Inside Controller");
					for (BookingInfo bookingInfo : bookingInfos) {
						System.out.println(bookingInfo);
					}
				
	          
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	

	 
	
            }
	private void getPassengerDetailsBySchedule(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
		//System.out.println("Inside Controller");
		int scheduleId=Integer.parseInt(request.getParameter("scheduleId"));
		BookingInfoServiceImpl bookingInfoServiceImpl=new BookingInfoServiceImpl();
		
		try {
			List<BookingInfo>bookingInfos=bookingInfoServiceImpl.getBookingInfoByScheduleId(scheduleId);
			for (BookingInfo bookingInfo : bookingInfos) {
				System.out.println(bookingInfo);
//				  request.setAttribute("bookingInfos",bookingInfos);
//		            RequestDispatcher dispatcher=request.getRequestDispatcher("myTicket.jsp");
//					dispatcher.forward(request, response);
			}
		} catch (SQLException e) {			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void getPassengerDetailsByseatType(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
		System.out.println("Inside Controller");
		String seatType=request.getParameter("seatType");
		BookingInfoServiceImpl bookingInfoServiceImpl=new BookingInfoServiceImpl();
		
		try {
			List<BookingInfo>bookingInfos=bookingInfoServiceImpl.getPassengerDetailsByseatType(seatType);
			for (BookingInfo bookingInfo : bookingInfos) {
				System.out.println(bookingInfo);
			}
		} catch (SQLException e) {			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

	private void getPassengerDetailsByShift(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
		
		System.out.println("Inside Controller");
		String shift=request.getParameter("shift");
		System.out.println(shift);
		BookingInfoServiceImpl bookingInfoServiceImpl=new BookingInfoServiceImpl();
		
		try {
			List<BookingInfo>bookingInfos=bookingInfoServiceImpl.getPassengerDetailsByShift(shift);
			for (BookingInfo bookingInfo : bookingInfos) {
				System.out.println(bookingInfo);
			}
		} catch (SQLException e) {			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	

	private void listOffer(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {

		List<Offer> listOffer = offerDao.selectAllOffers();

		request.setAttribute("listOffer", listOffer);

		RequestDispatcher dispatcher = request.getRequestDispatcher("offer-list.jsp");

		dispatcher.forward(request, response);
	}

	private void addOffer(HttpServletRequest request, HttpServletResponse response) {

		newOfferService = new OfferServiceImpl();

		String offer_name = request.getParameter("add_offer_name");

		String offer_rate1 = request.getParameter("add_offer_rate");
		double offer_rate = Double.valueOf(offer_rate1);

		Offer newOffer = new Offer(offer_name, offer_rate);

		try {
			newOfferService.addNewOffer(newOffer);
			response.sendRedirect("listOffer");

		} catch (SQLException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	private void deleteOffer(HttpServletRequest request, HttpServletResponse response) {

		String o_id = request.getParameter("o_offerid");

		int del_offer_id1 = Integer.parseInt(o_id);

		try {
			
			offerDao.deleteOffer(del_offer_id1);

			response.sendRedirect("listOffer");

		} catch (SQLException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	private void updateOffer(HttpServletRequest request, HttpServletResponse response) {

		String o_id1 = request.getParameter("updt_offer_id");

		String o_rate1 = request.getParameter("updt_offer_rate");

		int updt_offer_id1 = Integer.valueOf(o_id1);

		double updt_offer_rate1 = Double.valueOf(o_rate1);

		Offer updtOffer = new Offer(updt_offer_id1, updt_offer_rate1);

		try {

			newOfferService.updateOffer(updtOffer);
			response.sendRedirect("listOffer");

		} catch (SQLException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
	
private void showMyTicket(HttpServletRequest request, HttpServletResponse response)
		throws SQLException, IOException, ServletException {
	// int ticketId=Integer.parseInt(request.getParameter("ticketid"));
	 int ticketId= 4001;
	   BookingInfoServiceImpl bookingInfoServiceImpl=new BookingInfoServiceImpl();
	   try {
		   BookingInfo bookingInfo;
		bookingInfo=bookingInfoServiceImpl.findBookinInfoById(ticketId);
		 System.out.println("Inside Controller");
		 
				System.out.println(bookingInfo);
				
				request.setAttribute("myTick", bookingInfo);
				
				RequestDispatcher dispatcher = request.getRequestDispatcher("myTicket.jsp");
				dispatcher.forward(request, response);

//				request.setAttribute("ticket",bookingInfo );
//				RequestDispatcher dispatcher=request.getRequestDispatcher("viewTickets.jsp");
//				dispatcher.forward(request, response);
;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	   
	

	

}


private void showChangeStatusForm(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	RequestDispatcher dispatcher = request.getRequestDispatcher("changeStatus.jsp");
	dispatcher.forward(request, response);

}
private void showNewForm(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	RequestDispatcher dispatcher = request.getRequestDispatcher("feedback_form.jsp");
	dispatcher.forward(request, response);

}
	private void showNewComplaintForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("complaint_form.jsp");
		dispatcher.forward(request, response);

	}

	private void listComplaint(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		
		List<Complaint> listComplaint = complaintDAO.selectAllComplaints();
		request.setAttribute("listComplaints", listComplaint);
		RequestDispatcher dispatcher = request.getRequestDispatcher("complaint-list.jsp");
		dispatcher.forward(request, response);

	}

	private void insertComplaint(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		int c_complaintid = 1;
		String c_complaint = request.getParameter("c_complaint");
		int c_flightid = Integer.parseInt(request.getParameter("c_flightid"));
		int c_userid = Integer.parseInt(request.getParameter("c_userid"));
		String c_status = request.getParameter("c_status");

		Complaint complaint = new Complaint(c_complaintid, c_complaint, c_flightid, c_userid, c_status);
		complaintDAO.insertComplaint(complaint);

		
		RequestDispatcher dispatcher = request.getRequestDispatcher("feedback_form.jsp");
		try {
			dispatcher.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	private void listFeedback(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<Feedback> listFeedback = feedbackDAO.selectAllFeedbacks();
		request.setAttribute("listFeedback", listFeedback);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("feedback-list.jsp");
		dispatcher.forward(request, response);

	}

	// myfeedbacks;
	private void myFeedbacks(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		HttpSession session = request.getSession();

		String userMail = (String) session.getAttribute("currentUser");

		List<Feedback> myFeedback = feedbackDAO.myFeedbacks(userMail);
		request.setAttribute("myFeedback", myFeedback);

		System.out.println("usermail form serv" + userMail);
		RequestDispatcher dispatcher = request.getRequestDispatcher("myfeedback-list.jsp");
		dispatcher.forward(request, response);

	}
	private void myComplaints(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		HttpSession session = request.getSession();
		

		String userMail = (String) session.getAttribute("currentUser");
		List<Complaint> myComplaint = complaintDAO.myComplaints(userMail);
		request.setAttribute("myComplaints", myComplaint);

		System.out.println("usermail form serv" + userMail);
		RequestDispatcher dispatcher = request.getRequestDispatcher("mycomplaint-list.jsp");
		dispatcher.forward(request, response);

	}



	private void insertFeedback(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		/*
		 * * <!-- fd_feedback fd_feedbackid fd_flightid fd_rating fd_userid -->
		 */
		int fd_feedbackid = 1;
		String fd_feedback = request.getParameter("fd_feedback");
		int fd_rating = Integer.parseInt(request.getParameter("fd_rating"));
		int fd_flightid = Integer.parseInt(request.getParameter("fd_flightid"));
		int fd_userid = Integer.parseInt(request.getParameter("fd_userid"));
		// doing some temp. change
		Feedback feedback = new Feedback(fd_feedbackid, fd_feedback, fd_rating, fd_flightid, fd_userid);
		feedbackDAO.insertFeedback(feedback);

		response.sendRedirect("list");
//         System.out.println("rating and flight id sequ:");
//         System.out.println(fd_rating+" "+fd_flightid);

	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {

		int fd_feedbackid = Integer.parseInt(request.getParameter("fd_feedbackid"));
		Feedback existingFeedback = feedbackDAO.selectFeedback(fd_feedbackid);
		RequestDispatcher dispatcher = request.getRequestDispatcher("feedback_form.jsp");
		request.setAttribute("feedbackform", existingFeedback);
		dispatcher.forward(request, response);

	}

	private void updateFeedback(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		int fd_feedbackid = Integer.parseInt(request.getParameter("fd_feedbackid"));
		String fd_feedback = request.getParameter("fd_feedback");
		int fd_rating = Integer.parseInt(request.getParameter("fd_rating"));
		// int fd_feedbackid = Integer.parseInt(request.getParameter("fd_feedbackid"));
		// int fd_flightid = Integer.parseInt(request.getParameter("fd_flightid"));
		// int u_userid = Integer.parseInt(request.getParameter("u_userid"));
		Feedback updateFeedback = new Feedback(fd_feedbackid, fd_feedback, fd_rating);
		feedbackDAO.updateFeedback(updateFeedback);

		System.out.println("update datas test;;: " + fd_feedbackid + fd_feedback + fd_rating);
		response.sendRedirect("/list");
	}
	
	private void updateComplaint(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
  //c_complaintid, c_complaint, c_flightid, c_userid, c_status
		
		
		int c_complaintid = Integer.parseInt(request.getParameter("c_complaintid"));
    System.out.println("my id in the update stuats is "+c_complaintid);
		
		
		/*
		
		int fd_feedbackid = Integer.parseInt(request.getParameter("fd_feedbackid"));
		Feedback existingFeedback = feedbackDAO.selectFeedback(fd_feedbackid);
		RequestDispatcher dispatcher = request.getRequestDispatcher("feedback_form.jsp");
		request.setAttribute("feedbackform", existingFeedback);
		dispatcher.forward(request, response);
		**/
//		int fd_feedbackid = Integer.parseInt(request.getParameter("fd_feedbackid"));
//		Feedback existingFeedback = feedbackDAO.selectFeedback(fd_feedbackid);
//		
		//update
		String c_status = request.getParameter("c_status");
		 
		Complaint updateC_status = new Complaint(c_status, c_complaintid );
		
		complaintDAO.updateComplaint(updateC_status);
		response.sendRedirect("clist");

		System.out.println("update datas test;;: " + c_status + c_complaintid );
		//response.sendRedirect("/clist");
	}

	private void deleteFeedback(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		int fd_feedbackid = Integer.parseInt(request.getParameter("fd_feedbackid"));
		feedbackDAO.deleteFeedback(fd_feedbackid);
		response.sendRedirect("list");
	}

	private void scheduleFlight(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		FlightScheduleServiceImpl scheduleFlight = new FlightScheduleServiceImpl();
		String flightid = request.getParameter("flight_id");
		int flight_id = Integer.valueOf(flightid);
		String arrivalDate = request.getParameter("flight_arrival_date");
		String arrivalTime = request.getParameter("flight_arrival_time");
		String departureDate = request.getParameter("flight_departure_date");
		String departureTime = request.getParameter("flight_departure_time");
		String stoptype = request.getParameter("flight_stop_types");
		String flightrouteid = request.getParameter("flight_routeid");
		int flight_route_id = Integer.valueOf(flightrouteid);
		String flightofferid = request.getParameter("flight_offerid");
		int flight_offerid = Integer.valueOf(flightofferid);
		String availibilitystatus = request.getParameter("flight_availibility_status");
		System.out.println("flight_id:-" + flight_id + " flight_route_id:-" + flight_route_id + ":-" + flight_route_id
				+ " flight_offerid" + flight_offerid);
		Flight_Schedule schedule = new Flight_Schedule(arrivalDate, departureDate, arrivalTime, departureTime, stoptype,
				availibilitystatus, flight_id, flight_route_id, flight_offerid);
		try {
			scheduleFlight.schduleFLight(schedule);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
