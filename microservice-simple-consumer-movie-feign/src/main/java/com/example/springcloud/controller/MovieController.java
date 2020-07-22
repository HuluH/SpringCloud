package com.example.springcloud.controller;

import com.example.springcloud.entry.User;
import com.example.springcloud.feignInterface.UserFeignClient;
import com.netflix.discovery.converters.Auto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: microservice-simple-provider-user
 * @description:
 * @author: ss
 * @create: 2020-06-27 15:28
 **/
@Slf4j
@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/users/{id}")
    public User findById(@PathVariable Long id) {
        //此处使用 feign
        User user = this.userFeignClient.findById(id);
        //电影微服务的业务
        log.info("电影微服务8003:{}",user.toString());
        return user;
    }
}
