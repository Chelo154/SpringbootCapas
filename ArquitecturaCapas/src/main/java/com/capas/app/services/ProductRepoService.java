package com.capas.app.services;

import java.util.ArrayList;

import com.capas.domain.Product;

public class ProductRepoService {
	
	private ArrayList<Product> products;
	
	public ProductRepoService() {
		products = new ArrayList<Product>();
	}
	
	public void saveProduct(Product product) {
		products.add(product);
	}
	
	public ArrayList<Product> getProducts(){
		return products;
	}

}
