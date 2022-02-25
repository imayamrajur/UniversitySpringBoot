package com.raju.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raju.dao.EmployeeDAO;
import com.raju.modul.Employee;

@Service
public class EmployeeServiceImple implements EmployeeService {

	@Autowired
	EmployeeDAO employeeDAO;
	
	@Override
	public List<Employee> getAllEmployeeList() {
		List<Employee> list = employeeDAO.getAllEmployeeList();
		return list;
	}

	@Override
	public void addEmployeeDetails(Employee employee) {
		employeeDAO.addEmployeeDetails(employee);
		
	}

	@Override
	public Optional<Employee> findOneEmployee(Integer empId) {
		Optional<Employee> findOne = employeeDAO.findOneEmployee(empId);
		return findOne;
	}

	@Override
	public void updateEmployee(Employee employee, Integer empId) {
		employeeDAO.updateEmployee(employee, empId);
		
	}

	@Override
	public void deleteEmployee(Integer empId) {
		employeeDAO.deleteEmployee(empId);
		
	}

}
