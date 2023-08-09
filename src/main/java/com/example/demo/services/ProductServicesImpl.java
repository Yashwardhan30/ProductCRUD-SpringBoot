package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.example.demo.dao.ProductRepository;
import com.example.demo.model.Product;

@Service
public class ProductServicesImpl {

	@Autowired
	private ProductRepository prodRepo;

	public ResponseEntity<String> addProduct(Product prod) {
		String msg = null;
		prodRepo.save(prod);
		Product pdb = prodRepo.save(prod);
		if (pdb != null) {
			msg = "Product Added Sucessfully!!";
		}
		return new ResponseEntity<String>(msg, HttpStatus.OK);

	}

	public Product searchProduct(Integer prodId) {
		Optional<Product> p = prodRepo.findById(prodId);
		return p.get();
	}

	public List<Product> DisplayAllProducts() {
		return (List<Product>) prodRepo.findAll();
	}

	public String deleteProduct(Integer prodId) {
		prodRepo.deleteById(prodId);
		return "Product Deleted Sucessfully!!";
	}

	public Product UpdateProductQty(Integer prodId, Integer prodQty) {
		Optional<Product> p = prodRepo.findById(prodId);
		Product prod = p.get();
		prod.setProdQty(prodQty);
		prodRepo.save(prod);
		return prod;
	}

	public Product UpdateProductPrice(Integer prodId, Integer prodPrice) {
		Optional<Product> p = prodRepo.findById(prodId);
		Product prod = p.get();
		prod.setProdPrice(prodPrice);
		prodRepo.save(prod);
		return prod;
	}

}
