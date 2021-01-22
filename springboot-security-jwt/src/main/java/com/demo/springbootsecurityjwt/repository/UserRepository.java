package com.demo.springbootsecurityjwt.repository;

import com.demo.springbootsecurityjwt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


public interface UserRepository extends JpaRepository<User, Integer> {

     User findByUserName(String username);
}
