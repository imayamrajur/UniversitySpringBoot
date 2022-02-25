package com.raju.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
	
	@GetMapping("/get")
	public String getData() {
		return "Welcome Chennai";
	}
	

}
