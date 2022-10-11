package com.cybage.service;

import java.util.List;

import com.cybage.dao.EmployeeDao;
import com.cybage.dao.EmployeeDaoImpl;
import com.cybage.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	EmployeeDao employeeDao=new EmployeeDaoImpl();
	@Override
	public void addEmployee(Employee employee) {
	
		employeeDao.addEmployee(employee);
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeById(id);
	}

	@Override
	public void deleteEmployee(int id) {
		employeeDao.deleteEmployee(id);
	}

	@Override
	public int updateEmployee(int id) {
		return employeeDao.updateEmployee(id);
	}

	@Override
	public List<Employee> getAllEmployess() {
		// TODO Auto-generated method stub
		return employeeDao.getAllEmployess();
	}

}
