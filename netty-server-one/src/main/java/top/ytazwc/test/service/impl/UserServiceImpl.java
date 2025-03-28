package top.ytazwc.test.service.impl;

import top.ytazwc.test.entity.User;
import top.ytazwc.test.service.UserService;

/**
 * @author 00103943
 * @date 2025-03-28 16:54
 * @package top.ytazwc.test.service.impl
 * @description
 */
public class UserServiceImpl implements UserService {

    @Override
    public String getUser() {
        System.out.println("netty server one ...");
        return User.builder().name("y-rpc one netty").age(21).build().toString();
    }
}
