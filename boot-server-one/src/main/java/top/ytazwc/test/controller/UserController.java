package top.ytazwc.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.ytazwc.test.service.UserService;

/**
 * @author 00103943
 * @date 2025-04-15 09:10
 * @package top.ytazwc.test
 * @description
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/get")
    public String getUser() {
        String user = userService.getUser();
        return "http remote ..." + user;
    }

}
