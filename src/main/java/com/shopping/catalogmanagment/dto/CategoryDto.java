package com.shopping.catalogmanagment.dto;

import com.shopping.base.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryDto extends BaseDto<Long> {
    private String name;

}
