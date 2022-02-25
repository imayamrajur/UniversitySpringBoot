package com.raju.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UniversityHubConfig {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Bean
	public RestTemplate getRestTemplate() {
		 
		return new RestTemplate();
	}
	
	public String loadgetParent() {
		String response = restTemplate.exchange("", 
				HttpMethod.GET, 
				null, 
				new ParameterizedTypeReference<String>() {
		}).getBody();
		return response;
	}

}
