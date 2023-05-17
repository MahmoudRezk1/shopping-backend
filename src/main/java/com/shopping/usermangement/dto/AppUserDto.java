package com.shopping.usermangement.dto;

import com.shopping.base.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AppUserDto extends BaseDto<Long> {
    private String firstName;
    private String lastName;
    private String userName;
}
