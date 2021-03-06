package com.raju.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raju.model.Employee;
import com.raju.service.IEmployeeService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/employees")
public class EmployeeRestController {
	
	@Autowired
	IEmployeeService service;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveEmployee(
			@RequestBody Employee employee)	
	{
		Integer id = service.saveEmployee(employee);
		return new ResponseEntity<String>("Employee '"+id+"'save",HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAllEmployees(){
		List<Employee> list = service.getAllEmployee();
		return new ResponseEntity<List<Employee>>(list,HttpStatus.OK);
	}
	
	@GetMapping("/one/{id}")
	public ResponseEntity<Employee> getOneEmployees(@PathVariable Integer id){
		Employee employee = service.getOneEmployee(id);
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
	}
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable Integer id){
		service.deleteEmployee(id);
		return new ResponseEntity<String>("Employee '"+id+"' Deleted",HttpStatus.OK);
	}
	
	@PutMapping("/modify/{id}")
	public ResponseEntity<String> updateEmployee(@PathVariable Integer id, @RequestBody Employee employee){
		
		Employee db = service.getOneEmployee(id);
		db.setEmpName(employee.getEmpName());
		db.setEmpSal(employee.getEmpSal());
		db.setEmpDept(employee.getEmpDept());
		service.saveEmployee(db);
		
		return new ResponseEntity<String>("Employee '"+id+" 'Update Successfully",HttpStatus.OK);
	}

}
