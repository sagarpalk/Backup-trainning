//package com.cybage.app.controller;
//
//import java.io.IOException;
//import java.sql.SQLException;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import com.cybage.app.service.BookTicketService;
//import com.cybage.app.service.BookTicketServiceImpl;
//
///**
// * Servlet implementation class BookTicket
// */
////@WebServlet("/")
//public class BookTicket extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public BookTicket() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		 doGet(request, response);
//        
//	}
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String action = request.getServletPath();
//
//		 
//
//        try {
//            switch (action) {
//          
//                case "/BookTicket":
//                	bookTicket(request, response);
//                   
//                    break;
//                  
//                case "/DeleteBookedTicket":
//                	deleteBookedTicket(request, response);
//                    
//                    break;
//                   
//                case "/ViewMyTickets":
//                   
//                    break;
//                    
//                case "/edit":
//                   
//                    break;
//              case "/update":
//                
//                    
//                case "/list":
//                   
//                    break;
//                case "/myfeedbacklist":
//                   
//                    break;
//                default:
//                   
//                    break;
//            }
//        } catch (SQLException ex) {
//            throw new ServletException(ex);
//        }
//	}
//
//	
//	
//	
//	
//	 private void bookTicket(HttpServletRequest request, HttpServletResponse response)
//	            throws SQLException, IOException, ServletException {
//		 
//		 com.cybage.app.model.BookTicket ticket=new com.cybage.app.model.BookTicket();
//			String scheduleId=request.getParameter("scheduleId");
//		     String passportId=request.getParameter("passportId");
//		     String classType=request.getParameter("classType");
//		     String numTickets=request.getParameter("numTickets");
//		     String userId=request.getParameter("userId");
//		     String status=request.getParameter("status");
//		     int flightscheduleId=Integer.parseInt(scheduleId);
//		     int flightPassportId=Integer.parseInt(passportId);
//		     int flightNumTickets=Integer.parseInt(numTickets);
//		     int curentuserId =Integer.parseInt(userId);
//		     ticket.setScheduleId(flightscheduleId);
//		     ticket.setPassportId(flightPassportId);
//		     ticket.setClassType(classType);
//		     ticket.setNumTickets(flightNumTickets);
//	         ticket.setStatus(status);
//	         ticket.setUserId(curentuserId);
//	           BookTicketServiceImpl ticketServiceImpl=new BookTicketServiceImpl();
//	            try {
//					
//	            	ticketServiceImpl.addBookTicket(ticket);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//	               
//	            }
//	 
//	 
//		private void deleteBookedTicket(HttpServletRequest request, HttpServletResponse response) throws  SQLException, IOException, ServletException {
//			System.out.println("Inside Controller");
//			String ticketid=request.getParameter("ticketId");
//			System.out.println(ticketid);
//			  int flightticketid=Integer.parseInt(ticketid);
//			BookTicketServiceImpl ticketServiceImpl=new BookTicketServiceImpl();
//			try {
//				ticketServiceImpl.cancelTicket(flightticketid);
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} 
//		}
//		private void listBookTicket(HttpServletRequest request, HttpServletResponse response)
//			    throws SQLException, IOException, ServletException {
////			        List < B > listFeedback = feedbackDAO.selectAllFeedbacks();
////			        request.setAttribute("listFeedback", listFeedback);
////			        RequestDispatcher dispatcher = request.getRequestDispatcher("feedback-list.jsp");
////			        dispatcher.forward(request, response);
////			       
//			    }
//
//}
