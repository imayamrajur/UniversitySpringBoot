package com.raju.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raju.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> 
{
	
	

}
