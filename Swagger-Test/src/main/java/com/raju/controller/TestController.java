package com.raju.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testswagger")
public class TestController {
	
	@GetMapping("/msg")
	public String doDetails() {
		return "Welcome Swagger";
	}

}
