package com.shopping.catalogmanagment.service;

import com.shopping.base.service.BaseService;
import com.shopping.catalogmanagment.entity.Category;
import com.shopping.catalogmanagment.repository.CategoryRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryService extends BaseService<Category,Long> {
    private final CategoryRepo categoryRepo;
    public Category findByName(String name){
        return categoryRepo.findByName(name);
    };
}
