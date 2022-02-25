package com.raju.service;

import java.util.List;
import java.util.Optional;

import com.raju.modul.SalesDetails;

public interface SalesService {
	
	public List<SalesDetails> getAllSalesDetail();
	public void addSalesDetails(SalesDetails salesDetails);
	public Optional<SalesDetails> findOneSalesDetails(Integer salesId);
	public void updateSalesDetails(SalesDetails salesDetails, Integer salesId);
	public void deleteSalesDetails(Integer salesId);

}
