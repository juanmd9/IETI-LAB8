package com.eci.cosw.springbootsecureapi.controller;

import com.eci.cosw.springbootsecureapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping( "api" )
public class ApiController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/users" )
    public ResponseEntity<?> getUsers() {
        return ResponseEntity.ok(userService.getUsers());
    }
}
