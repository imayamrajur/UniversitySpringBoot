package com.raju.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raju.modul.SalesDetails;
import com.raju.service.SalesService;

@RestController
@RequestMapping("sales/salesDetails")
public class SalesController {

	@Autowired
	SalesService salesService;

	@GetMapping("/getAll")
	public List<SalesDetails> getAllSalesDetail() {
		salesService.getAllSalesDetail();
		return null;
	}

	@GetMapping("/addSales")
	public void addSalesDetails(SalesDetails salesDetails) {
		salesService.addSalesDetails(salesDetails);

	}

	public Optional<SalesDetails> findOneSalesDetails(Integer salesId) {
		Optional<SalesDetails> oneSales = salesService.findOneSalesDetails(salesId);
		return oneSales;
	}

	@PutMapping("/updateSales")
	public void updateSalesDetails(SalesDetails salesDetails, Integer salesId) {
		salesService.updateSalesDetails(salesDetails, salesId);

	}

	@DeleteMapping("/deleteSales")
	public void deleteSalesDetails(@PathVariable Integer salesId) {
		salesService.deleteSalesDetails(salesId);

	}

}
