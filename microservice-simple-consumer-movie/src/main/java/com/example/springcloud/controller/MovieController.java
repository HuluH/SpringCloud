package com.example.springcloud.controller;

import com.example.springcloud.entry.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RequestMapping("/movies")
@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/users/{id}")
    public User findById(@PathVariable Long id) {
        //此处使用 restTemplate 的占位符
        User user = this.restTemplate.getForObject("http://microservice-simple-provider-user/users/{id}", User.class, id);
        //电影微服务的业务
        log.info("电影微服务8002:{}",user.toString());
        return user;
    }
}
