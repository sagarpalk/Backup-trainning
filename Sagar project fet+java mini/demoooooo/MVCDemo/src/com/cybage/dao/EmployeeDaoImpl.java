package com.cybage.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.cybage.model.Employee;
import com.cybage.utility.JDBCUtility;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee getEmployeeById(int id) {
		Employee employee=null;
		try{
			Connection connection=JDBCUtility.getConnection();
			PreparedStatement pstmt=connection.prepareStatement("select * from employee where id=?");
			pstmt.setInt(1,id);
			ResultSet resultSet=pstmt.executeQuery();
			while(resultSet.next())
			{
				int id1 =  resultSet.getInt(1);
				String name=resultSet.getString(2);
				String Department=resultSet.getString(3);
				return employee;
		}
	}catch (Exception e) {
		e.printStackTrace();
	}
	return employee;
	
	}

	@Override
	public int deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateEmployee(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Employee> getAllEmployess() {
		List<Employee>list=new ArrayList<Employee>();
		Employee employee=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
		//	Statement stmt=con.createStatement();
			System.out.println("Created DB connectio....");
			
			PreparedStatement pstmt=connection.prepareStatement("select * from employee");
			
			ResultSet resultSet=pstmt.executeQuery();
			while(resultSet.next())
			{
				int id =  resultSet.getInt(1);
				String name=resultSet.getString(2);
				String department=resultSet.getString(3);
				employee=new Employee(id,name,department);
				list.add(employee);
			}
			connection.close();
			return list;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
