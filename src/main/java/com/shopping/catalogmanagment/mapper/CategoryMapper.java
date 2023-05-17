package com.shopping.catalogmanagment.mapper;

import com.shopping.base.mapper.BaseMapper;
import com.shopping.catalogmanagment.dto.CategoryDto;
import com.shopping.catalogmanagment.entity.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper extends BaseMapper<Category, CategoryDto> {
}
