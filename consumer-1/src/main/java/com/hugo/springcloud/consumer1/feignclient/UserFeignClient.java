package com.hugo.springcloud.consumer1.feignclient;

import com.hugo.springcloud.common.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author:QIUHU
 * @description:
 * @date:Create in 4:42 PM 4/24/2019
 * @modified By:
 */
@FeignClient(value = "provider")
public interface UserFeignClient {
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> getUsers();

    @RequestMapping(value = "/user/{name}", method = RequestMethod.GET)
    public List<User> getUser(@PathVariable("name") String name);
}

