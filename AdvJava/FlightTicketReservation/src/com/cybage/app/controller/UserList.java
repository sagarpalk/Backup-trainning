package com.cybage.app.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.app.dao.UserDaoImpl;
import com.cybage.app.model.User;
import com.cybage.app.service.UserServiceImpl;





/**
 * Servlet implementation class UserList
 */
@WebServlet("/UserList")
public class UserList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 UserDaoImpl userDaoImpl = new UserDaoImpl();
     UserServiceImpl userServiceImpl = new UserServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		try {
			List<User> userList = userDaoImpl.displayAllUsers();
			System.out.println(userList);
			 request.setAttribute("userList", userList);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	       
	        RequestDispatcher dispatcher = request.getRequestDispatcher("/userList.jsp");
	        dispatcher.forward(request, response);
	}

	

}
