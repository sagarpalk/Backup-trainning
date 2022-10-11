//package com.cybage.app.controller;
//
//import java.io.IOException;
//
//
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import com.cybage.app.model.BookingInfo;
//import com.cybage.app.service.BookTicketServiceImpl;
//import com.cybage.app.service.BookingInfoService;
//import com.cybage.app.service.BookingInfoServiceImpl;
//
///**
// * Servlet implementation class BookinInfo
// */
//@WebServlet("/")
//public class BookinInfoController extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public BookinInfoController() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		String action = request.getServletPath();
//		System.out.println(action);
//
//		 
//
//        try {
//            switch (action) {
//          
//                case "/findByTicketId":
//                	getTicketByTicketId(request, response);
//                   
//                    break;
//                  
//                case "/viewMyTickets":
//                	getTicketByUserId(request, response);
//                    
//                    break;
//                   
//                case "/findPassendBySchedule":
//                	getPassengerDetailsBySchedule(request, response);
//                    break;
//                    
//                case "/findBySeatType":
//                	getPassengerDetailsByseatType(request, response);
//                    break;
//              case "/findByShift":
//            	  getPassengerDetailsByShift(request, response);
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
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		doGet(request, response);
//	}
//	private void getTicketByTicketId(HttpServletRequest request, HttpServletResponse response)
//            throws SQLException, IOException, ServletException {
//		   int ticketId=Integer.parseInt(request.getParameter("ticketid"));
//		   BookingInfoServiceImpl bookingInfoServiceImpl=new BookingInfoServiceImpl();
//		   try {
//			   BookingInfo bookingInfo;
//			bookingInfo=bookingInfoServiceImpl.findBookinInfoById(ticketId);
//			        // System.out.println("Inside Controller");
//					//System.out.println(bookingInfo);
////					request.setAttribute("ticket",bookingInfo );
////					RequestDispatcher dispatcher=request.getRequestDispatcher("myTicket.jsp");
////					dispatcher.forward(request, response);
//	
//		}
//		   catch (SQLException e) {
//		
//			e.printStackTrace();
//	}	
//
//	 
//	
//            }
//	private void getTicketByUserId(HttpServletRequest request, HttpServletResponse response)
//            throws SQLException, IOException, ServletException {
//		   int userId=Integer.parseInt(request.getParameter("userId"));
//		   BookingInfoServiceImpl bookingInfoServiceImpl=new BookingInfoServiceImpl();
//		   try {
//			List<BookingInfo>bookingInfos=new ArrayList<BookingInfo>();
//			bookingInfos=bookingInfoServiceImpl.getAllTicket(userId);
//			 System.out.println("Inside Controller");
//					for (BookingInfo bookingInfo : bookingInfos) {
//						System.out.println(bookingInfo);
//					}
//				
//	          
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}	
//
//	 
//	
//            }
//	private void getPassengerDetailsBySchedule(HttpServletRequest request, HttpServletResponse response)
//            throws SQLException, IOException, ServletException {
//		//System.out.println("Inside Controller");
//		int scheduleId=Integer.parseInt(request.getParameter("scheduleId"));
//		BookingInfoServiceImpl bookingInfoServiceImpl=new BookingInfoServiceImpl();
//		
//		try {
//			List<BookingInfo>bookingInfos=bookingInfoServiceImpl.getBookingInfoByScheduleId(scheduleId);
//			for (BookingInfo bookingInfo : bookingInfos) {
//				System.out.println(bookingInfo);
////				  request.setAttribute("bookingInfos",bookingInfos);
////		            RequestDispatcher dispatcher=request.getRequestDispatcher("myTicket.jsp");
////					dispatcher.forward(request, response);
//			}
//		} catch (SQLException e) {			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	private void getPassengerDetailsByseatType(HttpServletRequest request, HttpServletResponse response)
//            throws SQLException, IOException, ServletException {
//		System.out.println("Inside Controller");
//		String seatType=request.getParameter("seatType");
//		BookingInfoServiceImpl bookingInfoServiceImpl=new BookingInfoServiceImpl();
//		
//		try {
//			List<BookingInfo>bookingInfos=bookingInfoServiceImpl.getPassengerDetailsByseatType(seatType);
//			for (BookingInfo bookingInfo : bookingInfos) {
//				System.out.println(bookingInfo);
//			}
//		} catch (SQLException e) {			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//}
//
//	private void getPassengerDetailsByShift(HttpServletRequest request, HttpServletResponse response)
//            throws SQLException, IOException, ServletException {
//		
//		System.out.println("Inside Controller");
//		String shift=request.getParameter("shift");
//		System.out.println(shift);
//		BookingInfoServiceImpl bookingInfoServiceImpl=new BookingInfoServiceImpl();
//		
//		try {
//			List<BookingInfo>bookingInfos=bookingInfoServiceImpl.getPassengerDetailsByShift(shift);
//			for (BookingInfo bookingInfo : bookingInfos) {
//				System.out.println(bookingInfo);
//			}
//		} catch (SQLException e) {			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//}
//	 
//	
//            
//
//
//}
