package com.hugo.springcloud.consumer1.feignclient.fallback;

import com.hugo.springcloud.common.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:QIUHU
 * @description:
 * @date:Create in 5:31 PM 4/24/2019
 * @modified By:
 */
public class UserFeignClient implements com.hugo.springcloud.consumer1.feignclient.UserFeignClient {


    @Override
    public List<User> getUsers() {

        User user = new User("3", "fallback", "fallback@oocl.com");
        List<User> users = new ArrayList<>();
        users.add(user);
        return null;
    }

    @Override
    public List<User> getUser(String name) {
        return null;
    }
}
