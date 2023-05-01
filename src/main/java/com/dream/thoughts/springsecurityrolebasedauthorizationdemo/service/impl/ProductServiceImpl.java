package com.dream.thoughts.springsecurityrolebasedauthorizationdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dream.thoughts.springsecurityrolebasedauthorizationdemo.entity.Product;
import com.dream.thoughts.springsecurityrolebasedauthorizationdemo.repository.ProductRepository;
import com.dream.thoughts.springsecurityrolebasedauthorizationdemo.service.ProductService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repo;

	@Override
	public List<Product> listAll() {
		return repo.findAll();
	}

	@Override
	public void save(Product product) {
		repo.save(product);

	}

	@Override
	public Product get(long id) {
		return repo.findById(id).get();
	}

	@Override
	public void delete(long id) {
		repo.deleteById(id);
	}

}
