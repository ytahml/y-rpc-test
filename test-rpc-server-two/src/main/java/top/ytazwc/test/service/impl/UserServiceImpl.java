package top.ytazwc.test.service.impl;

import top.ytazwc.test.entity.User;
import top.ytazwc.test.service.UserService;

/**
 * @author 00103943
 * @date 2025-03-25 08:48
 * @package top.ytazwc.test.service.impl
 * @description
 */
public class UserServiceImpl implements UserService {
    @Override
    public String getUser() {
        System.out.println("service two remoted ...");
        User user = User.builder()
                .age(21)
                .name("y-rpc-2")
                .build();
        return user.toString();
    }

}
