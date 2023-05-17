package com.shopping.usermangement.repository;

import com.shopping.base.repository.BaseRepo;
import com.shopping.usermangement.entity.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends BaseRepo<Role,Long> {
    Role findByName(String name);
}
