package com.learn.MultipleDataSourceDemo.primary.repository;

import com.learn.MultipleDataSourceDemo.primary.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
