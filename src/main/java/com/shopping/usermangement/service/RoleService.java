package com.shopping.usermangement.service;

import com.shopping.base.service.BaseService;
import com.shopping.usermangement.entity.Role;
import com.shopping.usermangement.repository.RoleRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleService extends BaseService<Role,Long> {
    private final RoleRepo roleRepo;
    public Role findByName(String name){
        return roleRepo.findByName(name);
    };
}
