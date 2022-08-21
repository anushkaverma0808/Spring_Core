package com.productapp.dao;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data

@AllArgsConstructor
public class Product {
	private Integer id;
	private String name;
	private BigDecimal price;
	private boolean isAvailable;
	
public Product() {
		
		//this.id = 0;
		this.name = "";
		this.price = null;
		this.isAvailable = false;
	}

	
	public Product(String name, BigDecimal price, boolean isAvailable) {
		super();
		this.name = name;
		this.price = price;
		this.isAvailable = isAvailable;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public BigDecimal getPrice() {
		return price;
	}


	public void setPrice(BigDecimal price) {
		this.price = price;
	}


	public boolean isAvailable() {
		return isAvailable;
	}


	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	
	
}
