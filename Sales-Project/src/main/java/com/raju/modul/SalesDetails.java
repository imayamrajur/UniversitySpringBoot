package com.raju.modul;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class SalesDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer saleQuantity;
	private double netValue;
	private double commissionamount;
	
	@ManyToOne()
	@JoinColumn(name="productItemId")
	private ProductItems productItems;
	
	@ManyToOne
	@JoinColumn(name="employeeId")
	private Employee employee;
	
	public ProductItems getProductItemId() {
		return productItems;
	}
	public void setProductItemId(ProductItems productItemId) {
		this.productItems = productItemId;
	}
	public Integer getId() {
		return id;
	}
	public Integer getSaleQuantity() {
		return saleQuantity;
	}
	public double getNetValue() {
		return netValue;
	}
	public double getCommissionamount() {
		return commissionamount;
	}
	public Employee getEmployeeId() {
		return employee;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setSaleQuantity(Integer saleQuantity) {
		this.saleQuantity = saleQuantity;
	}
	public void setNetValue(double netValue) {
		this.netValue = netValue;
	}
	public void setCommissionamount(double commissionamount) {
		this.commissionamount = commissionamount;
	}
	public void setEmployeeId(Employee employeeId) {
		this.employee = employeeId;
	}
	
	

}
