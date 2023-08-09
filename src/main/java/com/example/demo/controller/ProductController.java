package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import com.example.demo.model.Product;
import com.example.demo.services.ProductServicesImpl;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductServicesImpl ps;

	@PostMapping("/create")
	public ResponseEntity<String> createProd(@RequestBody Product prod) {
		ResponseEntity<String> s = ps.addProduct(prod);
		return s;
	}

	@GetMapping("/get/{prodId}")
	public Product getId(@PathVariable Integer prodId) {
		Product prod = ps.searchProduct(prodId);
		return prod;
	}

	@GetMapping("/getall")
	public List<Product> getAll() {
		return ps.DisplayAllProducts();
	}

	@DeleteMapping("/delete/{prodId}")
	public String delete(@PathVariable Integer prodId) {
		String s = ps.deleteProduct(prodId);
		return s;
	}

	@PutMapping("/updateqty/{prodId}")
	public Product updateQty(@RequestBody Integer prodQty, @PathVariable Integer prodId) {
		Product prod = ps.UpdateProductQty(prodId, prodQty);
		System.out.println("Updated Sucessfully!!");
		return prod;
	}

	@PutMapping("/updateprice/{prodId}")
	public Product updatePrice(@RequestBody Integer prodPrice, @PathVariable Integer prodId) {
		Product prod = ps.UpdateProductQty(prodId, prodPrice);
		System.out.println("Updated Sucessfully!!");
		return prod;
	}

}
