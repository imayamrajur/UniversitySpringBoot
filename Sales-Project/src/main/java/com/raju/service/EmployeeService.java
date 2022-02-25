package com.raju.service;

import java.util.List;
import java.util.Optional;

import com.raju.modul.Employee;


public interface EmployeeService {
	
	public List<Employee> getAllEmployeeList();
	public void addEmployeeDetails(Employee employee);
	public Optional<Employee> findOneEmployee(Integer empId);
	public void updateEmployee(Employee employee, Integer empId);
	public void deleteEmployee(Integer empId);

}
