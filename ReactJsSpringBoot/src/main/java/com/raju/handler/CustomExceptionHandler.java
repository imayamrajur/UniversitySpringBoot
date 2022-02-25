package com.raju.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.raju.exception.EmployeeNotFoundException;

@RestControllerAdvice
public class CustomExceptionHandler {

	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<String> handlerEmployeeNotFound(EmployeeNotFoundException enfe){
		return new ResponseEntity<String>(enfe.getMessage(),HttpStatus.NOT_FOUND);
	}
}
