package com.raju.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raju.model.Employee;
import com.raju.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/pdf")
	public String savePdfFile(@RequestBody Employee employee) {
		return employeeService.savePdfFile(employee);
	}
	
	@PostMapping("/doc")
	public String saveDocFile(@RequestBody Employee employee) {
		return employeeService.saveDocFile(employee);
	}

}
