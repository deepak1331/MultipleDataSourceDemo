package com.learn.MultipleDataSourceDemo.service;

import com.learn.MultipleDataSourceDemo.primary.entity.Users;
import com.learn.MultipleDataSourceDemo.primary.repository.UserRepository;
import com.learn.MultipleDataSourceDemo.secondary.entity.Address;
import com.learn.MultipleDataSourceDemo.secondary.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    private AddressRepository repository;
    public Address add(Address address) {
        return repository.save(address);
    }

    public List<Address> findAll() {
        return repository.findAll();
    }

    public Address findAddressById(Long id) {
        return repository.findById(id).orElse(new Address());
    }
}