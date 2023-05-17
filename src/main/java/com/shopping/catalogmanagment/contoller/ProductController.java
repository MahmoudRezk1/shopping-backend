package com.shopping.catalogmanagment.contoller;

import com.shopping.catalogmanagment.dto.ProductDto;
import com.shopping.catalogmanagment.mapper.ProductMapper;
import com.shopping.catalogmanagment.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/product")
public class ProductController {
    private final ProductService productService;
    private final ProductMapper productMapper;
    @GetMapping(path = "")
    public ResponseEntity<?> findAll(){
        List<ProductDto> dtos =productMapper.map(productService.findAll());
        return ResponseEntity.ok(dtos);
    }
}
