package top.ytazwc.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.ytazwc.rpc.annotations.RpcScan;
import top.ytazwc.rpc.transport.socket.RpcServerSocket;

/**
 * @author 花木凋零成兰
 * @title ServerSocketSpring
 * @date 2025-03-25 22:03
 * @package top.ytazwc.test
 * @description 基于spring实现服务注册
 */
@RpcScan(basePackages = {"top.ytazwc"})
public class ServerSocketSpring {
    public static void main(String[] args) {
        // 通过注解实现注册服务
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ServerSocketSpring.class);
        RpcServerSocket rpcServerSocket = (RpcServerSocket) context.getBean(RpcServerSocket.class);
        rpcServerSocket.start();
//        UserService userService = (UserService) context.getBean("userServiceImpl");
//        userService.getUser();

    }
}
