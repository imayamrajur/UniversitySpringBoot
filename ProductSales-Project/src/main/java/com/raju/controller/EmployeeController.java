package com.raju.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raju.modul.Employee;
import com.raju.service.EmployeeService;

@RestController
@RequestMapping("/sales/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/getAll")
	public List<Employee> getAllEmployeeList() {
		
		return employeeService.getAllEmployeeList();
	}

	@PostMapping("/add")
	public void addEmployeeDetails(@RequestBody Employee employee) {
		employeeService.addEmployeeDetails(employee);
		
	}

	@GetMapping("/findId")
	public Optional<Employee> findOneEmployee(@PathVariable Integer empId) {
		
		return employeeService.findOneEmployee(empId);
	}

	@PutMapping("/update")
	public void updateEmployee(@RequestBody Employee employee,@PathVariable Integer empId) {
		employeeService.updateEmployee(employee, empId);
		
	}

	@DeleteMapping("/delete")
	public void deleteEmployee(@PathVariable Integer empId) {
		employeeService.deleteEmployee(empId);
		
	}


}
