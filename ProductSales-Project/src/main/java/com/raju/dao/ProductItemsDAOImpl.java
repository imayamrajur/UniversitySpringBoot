package com.raju.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.raju.modul.ProductItems;
import com.raju.repo.ProductItemsRepository;

@Repository
public class ProductItemsDAOImpl implements ProductItemsDAO {
	
	@Autowired
	ProductItemsRepository productItemsRepository;

	@Override
	public List<ProductItems> getAllProductItems() {
		List<ProductItems> listItem = productItemsRepository.findAll();
		return listItem;
	}

	@Override
	public void addProductItems(ProductItems productItems) {
		productItemsRepository.save(productItems);
		
	}

	@Override
	public Optional<ProductItems> findOneProductItems(Integer itemsId) {
		Optional<ProductItems> oneData = productItemsRepository.findById(itemsId);
		return oneData;
	}

	@Override
	public void updateProductItems(ProductItems productItems, Integer itemsId) {
		productItemsRepository.save(productItems).getId();
		
	}

	@Override
	public void deleteProductItems(Integer itemsId) {
		productItemsRepository.deleteById(itemsId);
		
	}

}
