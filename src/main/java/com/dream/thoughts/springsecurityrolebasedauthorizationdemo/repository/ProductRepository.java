package com.dream.thoughts.springsecurityrolebasedauthorizationdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dream.thoughts.springsecurityrolebasedauthorizationdemo.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
