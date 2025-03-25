package top.ytazwc.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.ytazwc.rpc.annotations.RpcScan;
import top.ytazwc.test.controller.UserController;

/**
 * @author 花木凋零成兰
 * @title ClientSocketSpring
 * @date 2025-03-25 22:48
 * @package top.ytazwc.test
 * @description
 */
@RpcScan("top.ytazwc")
public class ClientSocketSpring {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ClientSocketSpring.class);
        UserController userController = (UserController) context.getBean("userController");
        userController.getUser();

    }

}
