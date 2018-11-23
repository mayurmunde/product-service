package com.demo.ProductManagement.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.ProductManagement.Entities.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

	//by Method Named Query
	List<Product> findByProductName(String productName);
	
	// By Query
	@Query("select p from Product p where p.productName=?1 and p.productPrice=?2")
	List<Product> getProductByProductNameAndProductPrice(String productName,int productPrice );
	
}
