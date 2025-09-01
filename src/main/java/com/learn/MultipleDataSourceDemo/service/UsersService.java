package com.learn.MultipleDataSourceDemo.service;

import com.learn.MultipleDataSourceDemo.primary.entity.Users;
import com.learn.MultipleDataSourceDemo.primary.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    @Autowired
    private UserRepository repository;
    public Users add(Users user) {
        return repository.save(user);
    }

    public List<Users> findAll() {
        return repository.findAll();
    }

    public Users findUserById(Long id) {
        return repository.findById(id).orElse(new Users());
    }
}