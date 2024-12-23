package com.example.product_microservice.cqrs.query;


import com.example.product_microservice.Repository.ProductRepository;
import com.example.product_microservice.entity.Product;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductProjection {

    @Autowired
    private ProductRepository productRepository;

    @QueryHandler
    public Product handle(GetProductByIdQuery query) {
        return productRepository.findById(query.getId()).orElse(null);
    }

    @QueryHandler
    public List<Product> handle(FindAllProductsQuery query) {
        return productRepository.findAll();
    }

}