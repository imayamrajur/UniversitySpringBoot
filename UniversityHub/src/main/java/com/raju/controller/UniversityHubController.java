package com.raju.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
//@RequestMapping("/hub")
public class UniversityHubController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/university")
	public String getDetails() {
		String name = restTemplate.getForObject("", String.class);
		return name;
	}

}
