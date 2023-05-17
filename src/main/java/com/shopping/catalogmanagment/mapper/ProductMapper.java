package com.shopping.catalogmanagment.mapper;

import com.shopping.base.mapper.BaseMapper;
import com.shopping.catalogmanagment.dto.ProductDto;
import com.shopping.catalogmanagment.entity.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",uses = {CategoryMapper.class})
public interface ProductMapper extends BaseMapper<Product, ProductDto> {
}
