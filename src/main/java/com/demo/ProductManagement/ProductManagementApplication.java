package com.demo.ProductManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.demo.ProductManagement.Entities.Product;
import com.demo.ProductManagement.Services.ProductService;

@SpringBootApplication
public class ProductManagementApplication {

	
	
	public static void main(String[] args) {
	ConfigurableApplicationContext context = SpringApplication.run(ProductManagementApplication.class, args);
	Product p=new Product();
	p.setProductid(1);
	p.setProductName("mobile");
	p.setProductPrice(100);
	
	ProductService productService=context.getBean("productService",ProductService.class);
	Product insertedProduct= productService.insertProduct(p);
	System.out.println(insertedProduct);
	
	}
}
