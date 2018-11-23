package com.demo.ProductManagement.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ProductManagement.Entities.Product;
import com.demo.ProductManagement.Services.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping("/products")
	public Product insertProduct(@RequestBody Product product) {
		System.out.println("in PostMapping");
		return productService.insertProduct(product);

	}

	@GetMapping("/products")
	public Iterable<Product> getAllProducts() {
		System.out.println("inGetMapping All Products");
		return productService.getAllProducts();
	}

	@DeleteMapping("/products/{id}")
	public void deleteProducts(@PathVariable int id) {
		System.out.println("inDelete Mapping");
		productService.deleteProducts(id);
	}

	@GetMapping("/products/{id}")
	public Optional<Product> getSingleProducts(@PathVariable int id) {
		System.out.println("in GetMapping Single Product");
		return productService.getSingleProducts(id);
	}
	
	
	/*@PutMapping("/products/{id}")
	public Product updateProducts(@RequestBody Product product,@PathVariable int id) {
		System.out.println("in putMapping Single Product");
		return productService.updateProducts(product,id);
	}*/
	
	@GetMapping("/product/{name}")
	public List<Product> findByProductName(@PathVariable("name") String productName){
		return productService.findByProductName(productName);
		
	}
	
	@GetMapping("/product/{name}/{price}")
	public List<Product> getProductByProductNameAndProductPrice(@PathVariable("name") String productName,@PathVariable("price") int productprice){
		return productService.getProductByProductNameAndProductPrice(productName, productprice);
		
	}

}
