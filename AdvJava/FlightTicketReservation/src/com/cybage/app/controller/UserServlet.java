package com.cybage.app.controller;



import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.app.dao.UserDaoImpl;
import com.cybage.app.model.User;
import com.cybage.app.service.UserServiceImpl;



@WebServlet("/register")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//UserDao userDao = new UserDao();
      UserDaoImpl userDaoImpl = new UserDaoImpl();
      UserServiceImpl userServiceImpl = new UserServiceImpl();
       public UserServlet() {
        super();
       
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	resp.getWriter().append(req.getContextPath());
    	RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/userRegistration.jsp");
    	dispatcher.forward(req, resp);
    	super.doGet(req, resp);
    }  
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String role = request.getParameter("role");
		
		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		user.setPassword(password);
		user.setRole(role);
		
		
     
//
//        RequestDispatcher dispatcher = request.getRequestDispatcher("register/register.jsp");
//        dispatcher.forward(request, response);
		
		try {
			userServiceImpl.registerUser(user);
			
			 if (user != null) {
	                request.setAttribute("REGI", "Registration successful");
	            }

			  
		} catch (Exception e) {
			e.printStackTrace();
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("/userRegistration.jsp");
    	dispatcher.forward(request, response);
		
	}

}
