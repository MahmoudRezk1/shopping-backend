package com.shopping.base.mapper;

import com.shopping.base.dto.BaseDto;
import com.shopping.base.entity.BaseEntity;
import org.mapstruct.MappingTarget;

import java.util.List;
import java.util.Set;

public interface BaseMapper <T extends BaseEntity, DTO extends BaseDto>{
    DTO map(T t);
    T unMap(DTO dto);

    T unMap(@MappingTarget T t,DTO dto); // for not creating a new object
    List<DTO> map(List<T> t);
    Set<DTO> map(Set<T> t);
    List<T> unMap(List<DTO> dto);
}
