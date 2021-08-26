package com.capas.infra.springboot.responses;

import java.util.ArrayList;

import com.capas.domain.Product;

public class ProductsResponse {
	
	private ArrayList<ProductData>products;
	
	public ProductsResponse() {
		// TODO Auto-generated constructor stub
	}
	
	public ProductsResponse(ArrayList<Product> productsData) {
		products = new ArrayList<ProductData>();
		productsData.forEach(item -> products.add(new ProductData(item)));
	}

	public ArrayList<ProductData> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<ProductData> products) {
		this.products = products;
	}
	
	

}
