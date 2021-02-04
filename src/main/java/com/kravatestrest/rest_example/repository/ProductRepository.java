package com.kravatestrest.rest_example.repository;

import com.kravatestrest.rest_example.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
