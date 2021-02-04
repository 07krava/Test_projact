package com.kravatestrest.rest_example.service;
import com.kravatestrest.rest_example.model.Product;
import com.kravatestrest.rest_example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void create(Product product) {
        productRepository.save(product);
    }

    @Override
    public List<Product> readAll() {
        return productRepository.findAll();
    }

    @Override
    public Product read(Long id) {
        return productRepository.getOne(id);
    }

    @Override
    public boolean update(Product product, Long id) {
        if(productRepository.existsById(id)){
            product.setId(id);
            productRepository.save(product);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Long id) {
        if(productRepository.existsById(id)){
            productRepository.deleteById(id);
            return true;
        }
        return false;

    }
}
