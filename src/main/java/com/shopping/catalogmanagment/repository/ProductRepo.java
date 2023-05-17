package com.shopping.catalogmanagment.repository;

import com.shopping.base.repository.BaseRepo;
import com.shopping.catalogmanagment.entity.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends BaseRepo<Product,Long> {
    Product findByName(String name);
}
