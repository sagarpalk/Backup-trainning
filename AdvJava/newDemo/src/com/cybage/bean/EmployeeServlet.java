package com.cybage.bean;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.bean.Employee;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Employee> empList = new ArrayList<Employee>();
		
		Employee emp1 = new Employee();
		emp1.setId(1); emp1.setName("Jhon");emp1.setRole("Developer");
		
		Employee emp2 = new Employee();
		emp2.setId(2); emp2.setName("Era");emp2.setRole("Manager");
		
		empList.add(emp1);
		empList.add(emp2);
		
		ServletContext context=getServletContext();
		context.setAttribute("empList", empList);
		
		request.setAttribute("htmlTagData", "<br/> creates a new line.");
		request.setAttribute("url", "https://www.cybage.com");
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/employee.jsp");
		rd.forward(request, response);
	}

	


}
