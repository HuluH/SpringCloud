package com.example.springcloud.entry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @program: microservice-simple-provider-user
 * @description:
 * @author: ss
 * @create: 2020-06-27 15:26
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String id;
    private String username;
    private String name;
    private Integer age;
    private BigDecimal balance;
}
