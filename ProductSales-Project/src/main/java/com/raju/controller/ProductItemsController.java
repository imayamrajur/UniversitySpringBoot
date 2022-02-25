package com.raju.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raju.modul.ProductItems;
import com.raju.service.ProductItemsService;

@RestController
@RequestMapping("/sales/productitems")
public class ProductItemsController {
	
	@Autowired
	ProductItemsService productItemsService;
	
	@GetMapping("/getAll")
	public List<ProductItems> getAllProductItems(){
		return productItemsService.getAllProductItems();
	}
	@PostMapping("/add")
	public void addProductItems(@RequestBody ProductItems productItems) {
		productItemsService.addProductItems(productItems);
	}
	@GetMapping("/findOneId/{itemsId}")
	public Optional<ProductItems> findOneProductItems(@PathVariable Integer itemsId){
		return productItemsService.findOneProductItems(itemsId);
	}
	@PutMapping("/update")
	public void updateProductItems(@RequestBody ProductItems productItems, @PathVariable Integer itemsId) {
		productItemsService.updateProductItems(productItems, itemsId);
	}
	@DeleteMapping("/delete/{itemsId}")
	public void deleteProductItems(@PathVariable Integer itemsId) {
		productItemsService.deleteProductItems(itemsId);
	}


}
