package com.cybage.dao;

import java.util.List;

import com.cybage.model.Employee;

public interface EmployeeDao {
	void addEmployee(Employee employee);
	Employee getEmployeeById(int id);
	int deleteEmployee(int id);
	int updateEmployee(int id);
	List<Employee> getAllEmployess();
}
