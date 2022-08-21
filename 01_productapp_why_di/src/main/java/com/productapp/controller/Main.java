package com.productapp.controller;

import java.math.BigDecimal;
import com.productapp.dao.Product;
import com.productapp.service.ProductService;
import com.productapp.service.ProductServiceImpl;

public class Main {
	public static void main(String[] args) {

		ProductService productService = new ProductServiceImpl();
		
		for(Product p: productService.getAll()) {
			System.out.println(p.toString());
		}
		
		Product product = new Product("Headphone",new BigDecimal("1200"),true);
		productService.addProduct(product);
		
		System.out.println("Product Added");
		
		
		for(Product p: productService.getAll()) {
			System.out.println(p.toString());
		}	
			product.setName("iphone");
			product.setPrice(new BigDecimal("100000"));
			productService.updateProduct(4, product);
			
			for (Product p1 : productService.getAll()) {
				System.out.println(p1.toString());
			}
			
			System.out.println("Product Updated");

			productService.deleteProduct(4);
			for (Product p2 : productService.getAll()) {
				System.out.println(p2.toString());
			}
			
			System.out.println("Product Deleted");
	
		}

	}	


