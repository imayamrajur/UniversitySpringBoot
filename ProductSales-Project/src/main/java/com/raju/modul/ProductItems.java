package com.raju.modul;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductItems {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String productName;
	private double unitPrice;
	private double commissionPercent;
	
	public Integer getId() {
		return id;
	}
	public String getProductName() {
		return productName;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public double getCommissionPercent() {
		return commissionPercent;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public void setCommissionPercent(double commissionPercent) {
		this.commissionPercent = commissionPercent;
	}
	
	

}
