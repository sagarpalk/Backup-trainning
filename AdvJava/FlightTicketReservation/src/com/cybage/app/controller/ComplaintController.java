//package com.cybage.app.controller;
//
//import java.io.IOException;
//
//
//import java.sql.SQLException;
//
//import java.util.List;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import com.cybage.app.dao.ComplaintDaoImpl;
//
//import com.cybage.app.model.Complaint;
//import com.cybage.app.service.ComplaintDao;
//
//
//
//
//@WebServlet("/ComplaintController")
//public class ComplaintController extends HttpServlet {
//    private static final long serialVersionUID = 1L;
//    private ComplaintDao complaintDAO;
//  
//    public void init() {
//    	complaintDAO = new ComplaintDaoImpl();
//    }
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//    throws ServletException, IOException {
//        doGet(request, response);
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//    throws ServletException, IOException {
//        String action = request.getServletPath();
//
//        try {
//            switch (action) {
//          
////                case "/cnew":
////                    showNewForm(request, response);
////                    break;
//                  
////                case "/insert":
////                    insertFeedback(request, response);
////                    break;
////                   
////                case "/delete":
////                    deleteFeedback(request, response);
////                    break;
////                    
////                case "/edit":
////                    showEditForm(request, response);
////                    break;
////              case "/update":
////                  updateFeedback(request, response);
////                   break;
//                    
////                case "/clist":
////                	listComplaint(request, response);
////                    break;
////                case "/myfeedbacklist":
////                	myFeedbacks(request, response);
////                	break;
//                default:
//                    RequestDispatcher dispatcher = request.getRequestDispatcher("register.jsp");
//                    dispatcher.forward(request, response);
//                    break;
//            }
//        } catch (SQLException ex) {
//            throw new ServletException(ex);
//        }
//    }
//
//    private void listComplaint(HttpServletRequest request, HttpServletResponse response)
//    throws SQLException, IOException, ServletException {
//        List < Complaint > listComplaint = complaintDAO.selectAllComplaints();
//        request.setAttribute("listComplaints", listComplaint);
//        RequestDispatcher dispatcher = request.getRequestDispatcher("complaint-list.jsp");
//        dispatcher.forward(request, response);
//       
//    }
//    /*
//    //myfeedbacks;
//    private void myFeedbacks(HttpServletRequest request, HttpServletResponse response)
//    	    throws SQLException, IOException, ServletException {
//    	  HttpSession  session=request.getSession();
//  	     
//    	   String userMail=  (String) session.getAttribute("currentUser");
//    	        List < Feedback > myFeedback = feedbackDAO.myFeedbacks(userMail);
//    	        request.setAttribute("myFeedback", myFeedback);
//    	        
//    	      
//         	   System.out.println("usermail form serv"+userMail);
//    	        RequestDispatcher dispatcher = request.getRequestDispatcher("myfeedback-list.jsp");
//    	        dispatcher.forward(request, response);
//    	       
//    	    }
//
//    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
//    throws ServletException, IOException {
//        RequestDispatcher dispatcher = request.getRequestDispatcher("feedback_form.jsp");
//        dispatcher.forward(request, response);
//        
//    }
//    
//    private void insertFeedback(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
//
//    	
//    	int fd_feedbackid= 1;
//        String fd_feedback = request.getParameter("fd_feedback");
//        int fd_rating=Integer.parseInt(request.getParameter("fd_rating"));  
//        int fd_flightid=Integer.parseInt(request.getParameter("fd_flightid"));  
//        int fd_userid=Integer.parseInt(request.getParameter("fd_userid"));  
//          //doing some temp. change
//        Feedback feedback= new Feedback(fd_feedbackid, fd_feedback, fd_rating, fd_flightid,  fd_userid );
//         feedbackDAO.insertFeedback(feedback);
//
//        response.sendRedirect("list");
////         System.out.println("rating and flight id sequ:");
////         System.out.println(fd_rating+" "+fd_flightid);
//         
//         
//    }
//    
//      private void showEditForm(HttpServletRequest request, HttpServletResponse response)
//    throws SQLException, ServletException, IOException {
//    	  
//    	int fd_feedbackid = Integer.parseInt(request.getParameter("fd_feedbackid"));
//        Feedback existingFeedback =feedbackDAO.selectFeedback(fd_feedbackid);
//        RequestDispatcher dispatcher = request.getRequestDispatcher("feedback_form.jsp");
//        request.setAttribute("feedbackform", existingFeedback);
//        dispatcher.forward(request, response);
//       
//      
//    }
//
//    private void updateFeedback(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
//        
//    	int fd_feedbackid = Integer.parseInt(request.getParameter("fd_feedbackid"));   	 
//        String fd_feedback = request.getParameter("fd_feedback");
//        int fd_rating = Integer.parseInt(request.getParameter("fd_rating"));  
//       // int fd_feedbackid = Integer.parseInt(request.getParameter("fd_feedbackid"));
//     //   int fd_flightid = Integer.parseInt(request.getParameter("fd_flightid"));
//     //   int u_userid = Integer.parseInt(request.getParameter("u_userid"));
//        Feedback updateFeedback = new Feedback(fd_feedbackid, fd_feedback, fd_rating);
//        feedbackDAO.updateFeedback(updateFeedback);
//       
//   System.out.println("update datas test;;: "+ fd_feedbackid+fd_feedback+fd_rating);
//        response.sendRedirect("list");
//    }
//   
//  
//    private void deleteFeedback(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
//        int fd_feedbackid = Integer.parseInt(request.getParameter("fd_feedbackid"));
//        feedbackDAO.deleteFeedback(fd_feedbackid);
//        response.sendRedirect("list");
//    }
//    
//    */
//  
//}