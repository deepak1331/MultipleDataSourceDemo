package com.learn.MultipleDataSourceDemo.controller;

import com.learn.MultipleDataSourceDemo.secondary.entity.Address;
import com.learn.MultipleDataSourceDemo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {


    @Autowired
    private AddressService service;

    @PostMapping
    public Address saveAddress(@RequestBody Address address) {
        return service.add(address);
    }

    @GetMapping
    public List<Address> findAllAddress() {
        return service.findAll();
    }

    @GetMapping(path = "/{id}")
    public Address findAddressById(@PathVariable Long id) {
        return service.findAddressById(id);
    }
}