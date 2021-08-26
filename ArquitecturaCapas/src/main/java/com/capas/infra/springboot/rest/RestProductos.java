package com.capas.infra.springboot.rest;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capas.app.controller.ProductController;
import com.capas.domain.Product;
import com.capas.infra.springboot.request.CreateProductRequest;
import com.capas.infra.springboot.responses.OkResponse;
import com.capas.infra.springboot.responses.ProductsResponse;

@RestController
public class RestProductos {
	
	private ProductController controller;
	
	public RestProductos() {
		controller = new ProductController();
	}
	
	
	@PostMapping(path = "/product",consumes = "application/json",produces = "application/json")
	public OkResponse createProduct(@RequestBody CreateProductRequest request) {
		System.out.print(request.getNombre());
		
		controller.createProduct(request.getId(),request.getNombre(),request.getMonto(),request.getTipo());
		
		return new OkResponse("El producto se ha creado exitosamente");
	}
	
	@GetMapping(path = "/product",consumes = "application/json",produces = "application/json")
	public ProductsResponse getProducts() {
		ArrayList<Product> products = controller.getProducts();
		return new ProductsResponse(products);
	}
}
