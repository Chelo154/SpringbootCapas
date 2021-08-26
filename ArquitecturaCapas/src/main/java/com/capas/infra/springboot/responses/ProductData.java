package com.capas.infra.springboot.responses;

import com.capas.domain.Product;

public class ProductData {
	
	private int id;
	
	private String name;
	
	private double amount;
	
	private String type;

	public ProductData() {
		// TODO Auto-generated constructor stub
	}
	
	public ProductData(Product product) {
		
		id = product.getId();
		
		name = product.getName();
		
		amount = product.getAmount();
		
		type = product.getTypeName();
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
	

}
