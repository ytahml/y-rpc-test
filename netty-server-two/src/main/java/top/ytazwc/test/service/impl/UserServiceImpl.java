package top.ytazwc.test.service.impl;

import top.ytazwc.rpc.annotations.RpcService;
import top.ytazwc.test.entity.User;
import top.ytazwc.test.service.UserService;

/**
 * @author 花木凋零成兰
 * @title UserServiceImpl
 * @date 2025-03-28 19:56
 * @package top.ytazwc.test.service.impl
 * @description
 */
@RpcService(version = "2.0.0", group = "netty")
public class UserServiceImpl implements UserService {

    @Override
    public String getUser() {
        System.out.println("netty server one ...");
        return User.builder().name("y-rpc two netty").age(21).build().toString();
    }
}
