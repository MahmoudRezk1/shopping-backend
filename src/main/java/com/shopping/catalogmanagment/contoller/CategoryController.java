package com.shopping.catalogmanagment.contoller;

import com.shopping.catalogmanagment.dto.CategoryDto;
import com.shopping.catalogmanagment.mapper.CategoryMapper;
import com.shopping.catalogmanagment.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/category")
public class CategoryController {
    private final CategoryService categoryService;
    private final CategoryMapper categoryMapper;
    @GetMapping(path = "")
    public ResponseEntity<?> findAll(){
        List<CategoryDto> dtos =categoryMapper.map(categoryService.findAll());
        return ResponseEntity.ok(dtos);
    }
}
