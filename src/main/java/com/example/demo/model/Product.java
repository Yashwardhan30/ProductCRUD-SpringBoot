package com.example.demo.model;

import org.hibernate.annotations.DynamicUpdate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_table")
@DynamicUpdate
public class Product {

    @Id
    @Column(name = "prod_id")
    private Integer prodId;
    
    @Column(name = "prod_name")
    private String prodName;
    
    @Column(name = "prod_category")
    private String prodCategory;
    
    @Column(name = "prod_price")
    private Integer prodPrice;
    
    @Column(name = "prod_qty")
    private Integer prodQty;  

	public Product(Integer prodId, String prodName, String prodCategory, Integer prodPrice, Integer prodQty) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodCategory = prodCategory;
		this.prodPrice = prodPrice;
		this.prodQty = prodQty;
	}

	public Product() {
		
    }   

    public Integer getProdId() {
		return prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdCategory() {
		return prodCategory;
	}

	public void setProdCategory(String prodCategory) {
		this.prodCategory = prodCategory;
	}

	public Integer getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(Integer prodPrice) {
		this.prodPrice = prodPrice;
	}

	public Integer getProdQty() {
		return prodQty;
	}

	public void setProdQty(Integer prodQty) {
		this.prodQty = prodQty;
	}

	@Override
    public String toString() {

        return "ID: " + prodId + "\nName: " + prodName + "\nPrice: " + prodPrice + "\nQty: " + prodQty;
    }

}
