package top.ytazwc.test;

import top.ytazwc.rpc.config.RpcServiceConfig;
import top.ytazwc.rpc.transport.socket.RpcServerSocket;
import top.ytazwc.test.service.UserService;
import top.ytazwc.test.service.impl.UserServiceImpl;

/**
 * @author 00103943
 * @date 2025-03-25 08:46
 * @package top.ytazwc.test
 * @description
 */
public class SocketServer {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        RpcServiceConfig config = RpcServiceConfig.builder()
                .group("service")
                .version("1.0.0")
                .service(userService)
                .build();

        RpcServerSocket serverSocket = new RpcServerSocket();
        serverSocket.registerService(config);
        serverSocket.start();

    }

}
