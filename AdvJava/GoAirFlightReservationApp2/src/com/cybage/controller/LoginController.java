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

import com.cybage.service.IUserService;
import com.cybage.service.UserServiceImpl;

/**
 * Servlet implementation class LoginCheck
 */
@WebServlet({ "/LoginCheck" })
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IUserService userService = new UserServiceImpl();
	//private UserDaoImpl userDaoImpl = new UserDaoImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		System.out.println(email + " " + password);
		Login login = new Login();
		login.setLogin_id(email);
		login.setLogin_password(password);
		boolean flag = false;
		if (email.equals("admin@gmail.com") && password.equals("admin")) {
			flag = true;
		}

		try {
			if (userService.validate(login) || flag) {
				System.out.println("login success...");
				RequestDispatcher dispatcher = request.getRequestDispatcher("AdminHomePage.jsp");
				dispatcher.forward(request, response);
			} else {
				System.out.println("Hello user");
				RequestDispatcher dispatcher = request.getRequestDispatcher("UserHomePage.jsp");
				dispatcher.forward(request, response);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
