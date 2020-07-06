package com.example.springcloud.controller;

import com.example.springcloud.entry.User;
import com.example.springcloud.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @program: microservice-simple-provider-user
 * @description:
 * @author: ss
 * @create: 2020-06-27 15:52
 **/
@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable Long id){
        log.info("User微服务2,端口8004");
        return userRepository.findById(id);
    }
}
