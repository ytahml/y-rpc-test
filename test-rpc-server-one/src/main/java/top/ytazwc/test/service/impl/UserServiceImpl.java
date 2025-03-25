package top.ytazwc.test.service.impl;

import top.ytazwc.rpc.annotations.RpcService;
import top.ytazwc.test.entity.User;
import top.ytazwc.test.service.UserService;

/**
 * @author 花木凋零成兰
 * @title UserServiceImpl
 * @date 2025-03-24 19:48
 * @package top.ytazwc.test.service.impl
 * @description
 */
@RpcService(version = "1.1.0", group = "service")
public class UserServiceImpl implements UserService {

    @Override
    public String getUser() {
        System.out.println("service one remoted ... ");
        User user = new User("y-rpc-1", 21);
        return user.toString();
    }
}
