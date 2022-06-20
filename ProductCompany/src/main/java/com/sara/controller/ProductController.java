package com.sara.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sara.entity.Product;
import com.sara.repository.ProductRepository;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductRepository productRepository;
	
		
	@PostMapping("/save")
	public String saveProduct(@RequestBody Product product, HttpServletRequest request) {
		productRepository.save(product);
		return "Success Product";
	}
	
	@GetMapping("/getid/{id}")
	public List<Product> getProductSortId(@PathVariable int id){
		return productRepository.getProductSortId(id);
	}

}
