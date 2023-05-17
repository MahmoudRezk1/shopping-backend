package com.shopping.catalogmanagment.service;

import com.shopping.base.service.BaseService;
import com.shopping.catalogmanagment.entity.Product;
import com.shopping.catalogmanagment.repository.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService extends BaseService<Product,Long> {
    private final ProductRepo productRepo;

    public Product findByName(String name){
        return productRepo.findByName(name);
    };
}
