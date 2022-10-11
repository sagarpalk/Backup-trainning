package com.cybage.app.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.app.dao.UserDaoImpl;
import com.cybage.app.model.User;
import com.cybage.app.service.UserServiceImpl;




@WebServlet("/updateUserDetails")
public class UpdateUserDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 UserDaoImpl userDaoImpl = new UserDaoImpl();
     UserServiceImpl userServiceImpl = new UserServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUserDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			int id = Integer.parseInt(request.getParameter("id")) ;	
			String firstName =  request.getParameter("firstName");
			String lastName =  request.getParameter("lastName");
			String password =  request.getParameter("password");
			
		
		
		User user = new User(id, firstName, lastName, password);
		try {
			userServiceImpl.updateUserDetails(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("/addSuccess.jsp");
	}

}
