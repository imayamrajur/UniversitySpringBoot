package com.sara.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sara.entity.Product;
import com.sara.modul.Products;
import com.sara.repository.ProductRepository;

@RestController
@RequestMapping("/company")
public class ProductController {
	
	@Autowired
	ProductRepository productRepository;
	
	JdbcTemplate jdbcTemplate;
	
	RestTemplate restTemplate = new RestTemplate();
	
	@Value("${productUrl}")
	String productUrl;
	
	@PostMapping("/save")
	public String addCompany(@RequestBody Product product, HttpServletRequest request) {
		/*if(product.getPlace().equalsIgnoreCase("chennai")) {
		 restTemplate.postForEntity(productUrl, product, String.class );
		}else {*/
		productRepository.save(product);
		//}
		return "Success Company";
	}
	
	@PostMapping("/add")
	public String saveCompany(@RequestBody Product product) {
		
		productRepository.save(product);
		return "Success Save Company";
	}
	
	@GetMapping("/getid/{id}")
	public List<Product> getProductSortId(@PathVariable int id){
		
	      String url = "http://localhost:8082/product/getid/{id}";
	      
		if(id>3) {
			return restTemplate.getForObject(url, ArrayList.class, id); 
		}else {
			
			return productRepository.getProductSortId(id);
		}
	}
	
	public String addCompanies(@RequestBody Products products) {
		jdbcTemplate.update("INSERT INTO product(name,place) VALUES(?,?)",products);
		return "Success Pojo";
	}
	
	@GetMapping
	public List<Product> getAllCompany(){
		List<Product> list = productRepository.findAll();
		return list;
	}

}
