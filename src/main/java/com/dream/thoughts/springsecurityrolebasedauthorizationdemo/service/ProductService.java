package com.dream.thoughts.springsecurityrolebasedauthorizationdemo.service;

import java.util.List;

import com.dream.thoughts.springsecurityrolebasedauthorizationdemo.entity.Product;

public interface ProductService {

	List<Product> listAll();

	void save(Product product);

	Product get(long id);

	void delete(long id);
}
