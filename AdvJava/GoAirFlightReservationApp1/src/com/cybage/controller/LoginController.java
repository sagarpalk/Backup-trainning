package com.cybage.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.cybage.dao.UserDaoImpl;
import com.cybage.model.Login;
import com.cybage.model.User;

import com.cybage.service.IUserServiceImpl;
import com.cybage.service.UserServiceImpl;

/**
 * Servlet implementation class LoginCheck
 */
@WebServlet({ "/LoginCheck", "/logincheck" })
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IUserServiceImpl userService= new UserServiceImpl();
	
	private UserDaoImpl userDaoImpl=new UserDaoImpl();
	
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*
		 * String email=request.getParameter("email"); String
		 * password=request.getParameter("password");
		 * 
		 * Login login = new Login(email, password);
		 * 
		 * User user= userService.getUser(login); System.out.println("user"+user);
		 * if(user!=null) { System.out.println(user); HttpSession session=
		 * request.getSession(); session.setAttribute("user", user); String
		 * role=user.getUser_role();
		 * 
		 * System.out.println("redirect to repective home page");
		 * 
		 * if(role.equals("user")) {
		 * //System.out.println("redirect to user home page....");
		 * response.sendRedirect("UserHomePage.jsp");
		 * 
		 * }else { System.out.println("redirect to Admin home page...");
		 * response.sendRedirect("AdminHomePage.jsp"); }
		 * 
		 * }else { System.out.println("Invalid user .... redirect to login page");
		 * response.sendRedirect("Login.jsp"); }
		 */
		String email =  request.getParameter("email");
		String password =  request.getParameter("password");
		System.out.println(email +" "
		+password);
		
		Login login = new Login();
		login.setLogin_id(email);
		login.setLogin_password(password);
		boolean flag = false;
		if(email.equals("admin@gmail.com") && password.equals("admin")) {
			flag = true;
		}
		
		

		try {
			if(userService.validate(login) || flag) {
				
				System.out.println("login success...");
//				if(email.equals("admin@gmail.com") && password.equals("admin")) {
//					System.out.println("hello admin");
//					request.setAttribute("email", email);
//					
//					HttpSession  session=request.getSession();
//	            	   session.setAttribute("currentUser", email);
	            	   
					RequestDispatcher dispatcher = request.getRequestDispatcher("AdminHomePage.jsp");
					dispatcher.forward(request, response);
				
				}
//				else {
//					System.out.println("Hello user");
//					request.setAttribute("email", email);
//					
//					 HttpSession  session=request.getSession();
//	                 session.setAttribute("currentUser", email);
//	            	   
//					RequestDispatcher dispatcher = request.getRequestDispatcher("UserHomePage.jsp");
//					dispatcher.forward(request, response);
//					
//				}
			
			else {
				System.out.println("Hello user");
//				request.setAttribute("email", email);
//				
//				 HttpSession  session=request.getSession();
//                 session.setAttribute("currentUser", email);
            	   
				RequestDispatcher dispatcher = request.getRequestDispatcher("UserHomePage.jsp");
				dispatcher.forward(request, response);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
