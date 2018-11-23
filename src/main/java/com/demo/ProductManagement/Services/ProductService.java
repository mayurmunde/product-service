package com.demo.ProductManagement.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.demo.ProductManagement.Entities.Product;
import com.demo.ProductManagement.Repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository testRepository;

	public Product insertProduct( Product product) {
		return testRepository.save(product);

	}

	public Iterable<Product> getAllProducts() {
		return testRepository.findAll();
	}

	public void deleteProducts(int id) {
		
		 testRepository.deleteById(id);
	}

	public Optional<Product> getSingleProducts(int id) {
		// TODO Auto-generated method stub
		return testRepository.findById(id);
	}
	

	/*public Product updateProducts(Product product, int id) {
		
		if( testRepository.existsById(id)){
			return testRepository.save(product);
		}
		return null;
	}*/
	
	
	public List<Product> findByProductName(String productName){
		return testRepository.findByProductName(productName);
		
	}
	
	public List<Product> getProductByProductNameAndProductPrice(String productName,int productPrice){
		return testRepository.getProductByProductNameAndProductPrice(productName, productPrice);
		
	}
	

}
