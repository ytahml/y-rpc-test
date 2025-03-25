package top.ytazwc.test;

import top.ytazwc.rpc.config.RpcServiceConfig;
import top.ytazwc.rpc.transport.socket.RpcServerSocket;
import top.ytazwc.test.service.UserService;
import top.ytazwc.test.service.impl.UserServiceImpl;

/**
 * @author 花木凋零成兰
 * @title SocketServer
 * @date 2025-03-24 19:38
 * @package top.ytazwc.test
 * @description
 */
@Deprecated
public class SocketServer {

    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();
        RpcServerSocket serverSocket = new RpcServerSocket();
        RpcServiceConfig config = new RpcServiceConfig();
        config.setGroup("service");
        config.setVersion("1.0.0");
        config.setService(userService);

        serverSocket.registerService(config);

        serverSocket.start();

    }

}
