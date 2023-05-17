package com.shopping.usermangement.controller;

import com.shopping.usermangement.dto.AppUserDto;
import com.shopping.usermangement.mapper.AppUserMapper;
import com.shopping.usermangement.service.AppUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/user")
@RequiredArgsConstructor
public class AppUserController {
    private final AppUserService appUserService;
    private final AppUserMapper appUserMapper;

    @GetMapping("")
    public ResponseEntity<?> findAll(){
        List<AppUserDto> dtos = appUserMapper.map(appUserService.findAll());
        return ResponseEntity.ok(dtos);
    }
}
