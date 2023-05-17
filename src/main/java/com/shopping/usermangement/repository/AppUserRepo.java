package com.shopping.usermangement.repository;

import com.shopping.base.repository.BaseRepo;
import com.shopping.usermangement.entity.AppUser;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepo extends BaseRepo<AppUser,Long> {
}
