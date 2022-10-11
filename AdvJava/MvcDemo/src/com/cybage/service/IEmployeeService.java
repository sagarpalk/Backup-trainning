package com.cybage.service;

import java.util.List;

import com.cybage.model.Employee;

public interface IEmployeeService {
	void addEmployee(Employee employee);

	Employee getEmpById(int id);

	int deleteEmp(int id);

	int updateEmp(int id);
	
	List<Employee>getAllEmp();
}
