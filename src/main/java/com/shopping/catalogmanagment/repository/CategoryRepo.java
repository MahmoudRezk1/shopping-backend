package com.shopping.catalogmanagment.repository;

import com.shopping.base.repository.BaseRepo;
import com.shopping.catalogmanagment.entity.Category;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends BaseRepo<Category,Long> {
    Category findByName(String name);
}
