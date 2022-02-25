package com.raju.service;

import java.util.List;
import java.util.Optional;

import com.raju.modul.ProductItems;

public interface ProductItemsService {
	
	public List<ProductItems> getAllProductItems();
	public void addProductItems(ProductItems productItems);
	public Optional<ProductItems> findOneProductItems(Integer itemsId);
	public void updateProductItems(ProductItems productItems, Integer itemsId);
	public void deleteProductItems(Integer itemsId);


}
