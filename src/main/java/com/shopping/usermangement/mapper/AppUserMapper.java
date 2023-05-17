package com.shopping.usermangement.mapper;

import com.shopping.base.mapper.BaseMapper;
import com.shopping.usermangement.dto.AppUserDto;
import com.shopping.usermangement.entity.AppUser;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AppUserMapper extends BaseMapper<AppUser, AppUserDto> {
}
