package com.capas.app.controller;

import java.util.ArrayList;

import com.capas.app.services.ProductRepoService;
import com.capas.domain.Product;

public class ProductController {
	
	private ProductRepoService repoService;
	
	public ProductController() {
		repoService = new ProductRepoService();
	}
	
	public void createProduct(int id,String nombre, double amount,String tipo) {
		
		Product newProducto = new Product(id,nombre,amount,tipo);
		
		repoService.saveProduct(newProducto);
	}
	
	public ArrayList<Product> getProducts(){
		return repoService.getProducts();
	}

}
