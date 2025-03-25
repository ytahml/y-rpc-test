package top.ytazwc.test.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import top.ytazwc.rpc.annotations.RpcReference;
import top.ytazwc.test.service.UserService;

/**
 * @author 花木凋零成兰
 * @title UserController
 * @date 2025-03-25 22:46
 * @package top.ytazwc.test.controller
 * @description
 */
@Slf4j
@Component
public class UserController {

    @RpcReference(version = "1.1.0", group = "service")
    private UserService userService;

    public void getUser() {
        String user = userService.getUser();
        System.out.println(user);
    }

}
