package com.shopping.config;

import com.shopping.usermangement.entity.AppUser;
import com.shopping.usermangement.entity.Role;
import com.shopping.usermangement.service.AppUserService;
import com.shopping.usermangement.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@RequiredArgsConstructor
public class AppStartUp implements CommandLineRunner {
    private final AppUserService appUserService;
    private final RoleService roleService;

    @Override
    public void run(String... args) throws Exception {
        addRoleDemo();
        addUserDemo();

    }
    public void addUserDemo(){
        if (appUserService.findAll().isEmpty()){
            appUserService.insert(new AppUser("ahmed","rizk","ahmedrezk1","123456"
                    , Arrays.asList(roleService.findByName("ROLE_ADMIN"))));
            appUserService.insert(new AppUser("mahmoud","barakat","mahmoudbarakat2","456789"
                    , Arrays.asList(roleService.findByName("ROLE_USER"))));
        }
    }
    public void addRoleDemo(){
        if (roleService.findAll().isEmpty()){
            roleService.insert(new Role("ROLE_ADMIN"));
            roleService.insert(new Role("ROLE_USER"));
        }
    }
}
