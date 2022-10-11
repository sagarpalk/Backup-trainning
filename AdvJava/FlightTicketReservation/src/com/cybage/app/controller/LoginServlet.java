package com.cybage.app.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cybage.app.dao.UserDaoImpl;
import com.cybage.app.model.LoginBean;
import com.cybage.app.service.UserServiceImpl;



@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 UserDaoImpl userDaoImpl = new UserDaoImpl();
     UserServiceImpl userServiceImpl = new UserServiceImpl();

	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

	protected <HttpSession> void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String email =  request.getParameter("email");
		String password =  request.getParameter("password");
		
		LoginBean loginBean = new LoginBean();
		loginBean.setEmail(email);
		loginBean.setPassword(password);
		
		

		try {
			if(userServiceImpl.validate(loginBean)) {
				System.out.println("login success...");
				if(email.equals("admin@gmail.com") && password.equals("admin")) {
					System.out.println("hello admin");
					request.setAttribute("email", email);
					
					HttpSession  session=request.getSession();
	            	   session.setAttribute("currentUser", email);
	            	   
					RequestDispatcher dispatcher = request.getRequestDispatcher("/adminDashBoard.jsp");
					dispatcher.forward(request, response);
				
				}
				else {
					System.out.println("Hello user");
					request.setAttribute("email", email);
					
					 HttpSession  session=request.getSession();
	                 session.setAttribute("currentUser", email);
	            	   
					RequestDispatcher dispatcher = request.getRequestDispatcher("/userDashBoard.jsp");
					dispatcher.forward(request, response);
					
				}
			}
			else {
				System.out.println("login fail......");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
