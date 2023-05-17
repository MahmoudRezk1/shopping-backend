package com.shopping.usermangement.mapper;

import com.shopping.base.mapper.BaseMapper;
import com.shopping.usermangement.dto.RoleDto;
import com.shopping.usermangement.entity.Role;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleMapper extends BaseMapper<Role, RoleDto> {
}
