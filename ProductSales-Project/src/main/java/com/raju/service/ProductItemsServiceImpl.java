package com.raju.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raju.dao.ProductItemsDAO;
import com.raju.modul.ProductItems;

@Service
public class ProductItemsServiceImpl implements ProductItemsService {
	
	@Autowired
	ProductItemsDAO productItemsDAO;

	@Override
	public List<ProductItems> getAllProductItems() {
		
		return productItemsDAO.getAllProductItems();
	}

	@Override
	public void addProductItems(ProductItems productItems) {
		productItemsDAO.addProductItems(productItems);
		
	}

	@Override
	public Optional<ProductItems> findOneProductItems(Integer itemsId) {
		
		return productItemsDAO.findOneProductItems(itemsId);
	}

	@Override
	public void updateProductItems(ProductItems productItems, Integer itemsId) {
		productItemsDAO.updateProductItems(productItems, itemsId);
		
	}

	@Override
	public void deleteProductItems(Integer itemsId) {
		productItemsDAO.deleteProductItems(itemsId);
		
	}

}
