package com.example.product_microservice.Controllor;


import com.example.product_microservice.cqrs.query.FindAllProductsQuery;
import com.example.product_microservice.cqrs.query.GetProductByIdQuery;
import com.example.product_microservice.entity.Product;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/QueryProducts")
public class ProductQueryController {

    @Autowired
    private QueryGateway queryGateway;

    @GetMapping("/{id}")
    public Product getProductByUUID(@PathVariable String id){

        return queryGateway.query(new GetProductByIdQuery(id),Product.class).join();
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return queryGateway.query(new FindAllProductsQuery(), ResponseTypes.multipleInstancesOf(Product.class)).join();
    }


}
