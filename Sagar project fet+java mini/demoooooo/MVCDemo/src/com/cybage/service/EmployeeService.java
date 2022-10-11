package com.cybage.service;

import java.util.List;

import com.cybage.model.Employee;

public interface EmployeeService {
void addEmployee(Employee employee);
Employee getEmployeeById(int id);
void deleteEmployee(int id);
int updateEmployee(int id);
List<Employee> getAllEmployess();
}
