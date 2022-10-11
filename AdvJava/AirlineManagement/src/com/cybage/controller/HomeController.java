//package com.cybage.controller;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.Servlet;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import com.cybage.model.User;
//import com.cybage.service.UserServiceImpl;
//
///**
// * Servlet implementation class LoginServlet
// */
//@WebServlet(urlPatterns = { "/validate", "/auth" }, loadOnStartup = 2)
//public class HomeController extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//	private UserServiceImpl userService;
//	RequestDispatcher requestDispatcher=null;
//	
//	public HomeController() {
//		super();
//	}
//
//	/**
//	 * @see Servlet#init()
//	 */
//	// cannot add sqlException in throws clause:
//	// method does not alllow any new check execution
//	public void init() throws ServletException {
//		// dao instance
//		try {
//			userService = new UserServiceImpl();
//		} catch (Exception e) {
//			// centralized exception handling in servlet
//			// javax.ervlet.ServletException(String msg,throwable cause)
//			throw new ServletException("error in init of" + getClass(), e);
//		}
//	}
//
//	/**
//	 * @see Servlet#destroy()
//	 */
//	public void destroy() {
//		// dao cleanup
//		try {
//			userService.cleanUp();
//		} catch (Exception e) {
//			// System.out.println("err in destroy of "+getClass()+"err"+e);
//			throw new RuntimeException("error in destroy of" + getClass(), e);
//		}
//	}
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
//	 *      response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		{
//			// set response content type
//			response.setContentType("text/html");
//
//			// pw
//			try (PrintWriter pw = response.getWriter()) {
//				// read req data (req parameter) sent from client-->server
//				// API of javax .servlet.ServletRequest:
//				// public String getParamer(String name)
//				String email = request.getParameter("em");
//				String password = request.getParameter("pass");
//
//				// servlet invokes daos method for authentication/validation
//				User user = userService.getSelectedUsersDetails(email, password);
//
//				// check outcome
//				if (user == null)
//					pw.print("<h5>Invalid login please <a href='login.html'>Retry</a></h5>");
//				else {
//					pw.print("<h5>Loging Successfull! </h5>");
//					pw.print("<h5>Your details" + user + "</h5>");
//
//					// How to redirect the clnt from one servelt to another ?
//					// Method of javax.servlet.http.HttpServletResponse
//					// : public void sendRedirect(String location) throws IOExc
//					response.sendRedirect("topics");
//				}
//
//			} catch (Exception e) {
//				//
//				throw new ServletException("err in do-post of" + getClass(), e);
//			}
//		}
//
//	}
//}
