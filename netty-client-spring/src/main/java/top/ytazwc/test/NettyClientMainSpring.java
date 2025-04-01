package top.ytazwc.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.ytazwc.rpc.annotations.RpcScan;
import top.ytazwc.test.controller.UserController;

/**
 * @author 花木凋零成兰
 * @title ${NAME}
 * @date 2025-03-28 22:53
 * @package top.ytazwc.test
 * @description
 */
@RpcScan("top.ytazwc")
public class NettyClientMainSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(NettyClientMainSpring.class);
        UserController userController = (UserController) context.getBean("userController");
        for (int i = 0; i < 10; i++) {
            userController.testUserService();
        }
    }
}