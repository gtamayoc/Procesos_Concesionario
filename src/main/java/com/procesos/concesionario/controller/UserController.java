package com.procesos.concesionario.controller;

import com.procesos.concesionario.model.User;
import com.procesos.concesionario.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping(value = "/user/{id}")
    public User getById(@PathVariable(name = "id") Long id){
        return userService.getUserById(id).get();
    }
}