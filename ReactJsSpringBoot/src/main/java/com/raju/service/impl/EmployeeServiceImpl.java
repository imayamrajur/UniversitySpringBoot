package com.raju.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raju.exception.EmployeeNotFoundException;
import com.raju.model.Employee;
import com.raju.repo.EmployeeRepository;
import com.raju.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	private EmployeeRepository repo;

	@Override
	public Integer saveEmployee(Employee e) {
		Integer id = repo.save(e).getEmpId();
		return id;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> list = repo.findAll();
		return list;
	}

	@Override
	public Employee getOneEmployee(Integer id) {
		Optional<Employee> opt = repo.findById(id);
		
		Employee emp= opt.orElseThrow(()-> new EmployeeNotFoundException("Employee Not Exist"));
		
		/*
		Employee emp=null;
		if(opt.isPresent()) {
			emp = opt.get();
		}else {
			throw new EmployeeNotFoundException("Employee Not Exist");
		}
		*/
		return emp;
	}

	@Override
	public void deleteEmployee(Integer id) {
		Employee emp = getOneEmployee(id);
		repo.delete(emp);
		
	}

	
}
