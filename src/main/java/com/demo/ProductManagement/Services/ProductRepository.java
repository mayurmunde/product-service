package com.demo.ProductManagement.Services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.demo.ProductManagement.Entities.Product;

@Component("ProductRepository")
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
