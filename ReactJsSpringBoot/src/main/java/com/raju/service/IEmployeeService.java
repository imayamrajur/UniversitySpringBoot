package com.raju.service;

import java.util.List;

import com.raju.model.Employee;

public interface IEmployeeService {
	 Integer saveEmployee(Employee e);
	 List<Employee> getAllEmployee();
	 Employee getOneEmployee(Integer id);
	 void deleteEmployee(Integer id);	

}
