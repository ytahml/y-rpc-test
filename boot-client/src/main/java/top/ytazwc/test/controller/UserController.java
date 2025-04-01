package top.ytazwc.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import top.ytazwc.rpc.annotations.RpcReference;
import top.ytazwc.test.service.UserService;

/**
 * @author 00103943
 * @date 2025-04-01 17:13
 * @package top.ytazwc.test.controller
 * @description
 */
@Controller
public class UserController {

    @Autowired
    @Qualifier("userLocalService")
    private UserService userLocalService;

    @RpcReference(version = "1.1.1", group = "test")
    private UserService userService;

    public void testRpc() {
        userService.getUser();
    }

    public void testLocal() {
        userLocalService.getUser();
    }

}
