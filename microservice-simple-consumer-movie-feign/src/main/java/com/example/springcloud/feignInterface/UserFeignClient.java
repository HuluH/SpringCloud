package com.example.springcloud.feignInterface;

import com.example.springcloud.entry.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @program: microservice-simple-provider-user
 * @description:
 * @author: ss
 * @create: 2020-07-22 21:50
 **/
@FeignClient(name="microservice-simple-provider-user")
public interface UserFeignClient {
    @GetMapping("/users/{id}")
    User findById(@PathVariable("id") Long id);
}
