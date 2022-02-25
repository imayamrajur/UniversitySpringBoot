package com.raju.parent.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class Swagger2Config {

	@Bean
	public Docket swaggerConfig() {

		return new Docket(DocumentationType.SWAGGER_2).select().paths(PathSelectors.ant("/api/parent/*")).build()
				.apiInfo(new ApiInfo("Parent API", "Student Parent Details in University", "1.0",
						"http://university.com", new Contact("name", "url", "mrrajume@gmail.com"), "Opensource",
						"http://university.com", Collections.emptyList()));

	}

}
