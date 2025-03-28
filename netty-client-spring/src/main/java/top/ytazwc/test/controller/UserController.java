package top.ytazwc.test.controller;

import org.springframework.stereotype.Component;
import top.ytazwc.rpc.annotations.RpcReference;
import top.ytazwc.test.service.UserService;

/**
 * @author 花木凋零成兰
 * @title UserController
 * @date 2025-03-28 22:55
 * @package top.ytazwc.test.controller
 * @description
 */
@Component
public class UserController {

    @RpcReference(version = "2.0.0", group = "netty")
    private UserService userService;

    public void testUserService() {
        System.out.println("发起调用...");
        for (int i = 0; i < 10; i++) {
            String user = userService.getUser();
            System.out.println(user);
        }
        System.out.println("调用结束...");
    }

}
