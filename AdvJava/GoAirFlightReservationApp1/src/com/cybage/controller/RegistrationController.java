package com.cybage.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.model.User;

import com.cybage.service.IUserServiceImpl;
import com.cybage.service.UserServiceImpl;

/**
 * Servlet implementation class Registration
 */
@WebServlet({ "/Registration" })
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IUserServiceImpl userService= new UserServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		 String name=request.getParameter("firstName");
		 String email=request.getParameter("email");
		 String password=request.getParameter("password");
         String contact=request.getParameter("contact");
		 String address=request.getParameter("address");
		 int age=Integer.parseInt(request.getParameter("age"));
		 String gender=request.getParameter("gender");
		 String role=request.getParameter("role");
		// String role="user";
		 System.out.println(name +" "+email);
		
		 
		 User user=new User( name, email, password, contact, address, age, gender);
		 System.out.println(user);
		 
	boolean flag=userService.addUser(user);
	if(flag) {
		System.out.println("user added succefully....");
		response.sendRedirect("Login.jsp");
	}else {
		System.out.println("duplicate entry");
		response.sendRedirect("registration.jsp");
		
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
