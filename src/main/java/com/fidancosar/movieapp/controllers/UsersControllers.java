package com.fidancosar.movieapp.controllers;

import com.fidancosar.movieapp.model.requests.UsersRequest;
import com.fidancosar.movieapp.services.UsersService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UsersControllers {
    private final UsersService usersService;

    public UsersControllers(UsersService usersService) {
        this.usersService = usersService;
    }
    @PostMapping
    public ResponseEntity add(UsersRequest usersRequest) {
        usersService.add(usersRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body("Kullanıcı eklendi");


    }
}
