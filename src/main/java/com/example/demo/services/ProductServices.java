package com.example.demo.services;

import org.springframework.http.ResponseEntity;

import com.example.demo.model.Product;

public interface ProductServices {

	public ResponseEntity<String> addProduct(Product prod);
	public Product searchProduct(Integer prodId);
	public String deleteProduct(Integer prodId);
	public Iterable<Product> DisplayAllProducts();
	public Product UpdateProductQty(Integer prodId, Integer prodQty);
	public Product UpdateProductPrice(Integer prodId, Integer prodPrice);
	
}
