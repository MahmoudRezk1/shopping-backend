package com.shopping.usermangement.controller;

import com.shopping.usermangement.dto.RoleDto;
import com.shopping.usermangement.mapper.RoleMapper;
import com.shopping.usermangement.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/role")
@RequiredArgsConstructor
public class RoleController {
    private final RoleService roleService;
    private final RoleMapper roleMapper;

    @GetMapping("")
    public ResponseEntity<?> findAll(){
        List<RoleDto> dtos = roleMapper.map(roleService.findAll());
        return ResponseEntity.ok(dtos);
    }
}
