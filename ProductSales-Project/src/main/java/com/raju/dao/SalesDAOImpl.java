package com.raju.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.raju.modul.SalesDetails;
import com.raju.repo.SalesRepository;

@Repository
public class SalesDAOImpl implements SalesDAO {

	@Autowired
	SalesRepository salesRepository;

	@Override
	public List<SalesDetails> getAllSalesDetail() {
		List<SalesDetails> salesList = salesRepository.findAll();
		return salesList;
	}

	@Override
	public void addSalesDetails(SalesDetails salesDetails) {
		salesRepository.save(salesDetails);

	}

	@Override
	public Optional<SalesDetails> findOneSalesDetails(Integer salesId) {
		Optional<SalesDetails> oneSales = salesRepository.findById(salesId);
		return oneSales;
	}

	@Override
	public void updateSalesDetails(SalesDetails salesDetails, Integer salesId) {
		salesRepository.save(salesDetails).getId();

	}

	@Override
	public void deleteSalesDetails(Integer salesId) {
		salesRepository.deleteById(salesId);

	}

}
