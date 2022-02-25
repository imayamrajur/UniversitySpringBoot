package com.raju.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raju.dao.SalesDAO;
import com.raju.modul.SalesDetails;

@Service
public class SalesServiceImpl implements SalesService {
	
	@Autowired
	SalesDAO salesDAO;

	@Override
	public List<SalesDetails> getAllSalesDetail() {
		List<SalesDetails> salesList = salesDAO.getAllSalesDetail();
		return salesList;
	}

	@Override
	public void addSalesDetails(SalesDetails salesDetails) {
		salesDAO.addSalesDetails(salesDetails);
		
	}

	@Override
	public Optional<SalesDetails> findOneSalesDetails(Integer salesId) {
		Optional<SalesDetails> oneSales = salesDAO.findOneSalesDetails(salesId);
		return oneSales;
	}

	@Override
	public void updateSalesDetails(SalesDetails salesDetails, Integer salesId) {
		salesDAO.updateSalesDetails(salesDetails, salesId);
		
	}

	@Override
	public void deleteSalesDetails(Integer salesId) {
		salesDAO.deleteSalesDetails(salesId);
		
	}

}
