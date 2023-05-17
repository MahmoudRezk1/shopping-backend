package com.shopping.catalogmanagment.dto;

import com.shopping.base.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto extends BaseDto<Long> {
    private String name;
    private double price;
    private CategoryDto category;
    private int qty;
    private String imagePath;
}
