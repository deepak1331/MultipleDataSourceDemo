package com.learn.MultipleDataSourceDemo.controller;

import com.learn.MultipleDataSourceDemo.primary.entity.Users;
import com.learn.MultipleDataSourceDemo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UsersService service;

    @PostMapping
    public Users saveUser(@RequestBody Users user) {
        return service.add(user);
    }

    @GetMapping
    public List<Users> findAllUser() {
        return service.findAll();
    }

    @GetMapping(path = "/{id}")
    public Users findUserById(@PathVariable Long id) {
        return service.findUserById(id);
    }
}
