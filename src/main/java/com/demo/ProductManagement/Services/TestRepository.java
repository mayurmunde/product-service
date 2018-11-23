package com.demo.ProductManagement.Services;

import org.springframework.data.repository.CrudRepository;

import com.demo.ProductManagement.Entities.Product;

public interface TestRepository extends CrudRepository<Product, Integer> {

}
