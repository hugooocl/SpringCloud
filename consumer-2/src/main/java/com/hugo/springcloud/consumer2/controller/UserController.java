package com.hugo.springcloud.consumer2.controller;

import com.hugo.springcloud.common.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:QIUHU
 * @description:
 * @date:Create in 2:50 PM 4/24/2019
 * @modified By:
 */
@RestController
public class UserController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

//    @Autowired
//    private RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    private RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
//        Response response = restTemplate.getForObject("http://spring-cloud-provider/users", Response.class);
        User user = new User("2","hugo2","hugo@oocl.com");
        logger.info(this.getClass()+" : " + "users");
        List<User> users = new ArrayList<>();
        users.add(user);
        return users;
    }

}
