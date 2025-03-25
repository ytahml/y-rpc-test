package top.ytazwc.test;

import top.ytazwc.rpc.config.RpcServiceConfig;
import top.ytazwc.rpc.transport.proxy.RpcClientProxy;
import top.ytazwc.rpc.transport.socket.RpcClientSocket;
import top.ytazwc.test.service.UserService;

/**
 * @author 花木凋零成兰
 * @title SocketClient
 * @date 2025-03-24 20:00
 * @package top.ytazwc.test
 * @description
 */
@Deprecated
public class SocketClient {

    public static void main(String[] args) {

        RpcServiceConfig config = new RpcServiceConfig();
        config.setVersion("1.0.0");
        config.setGroup("service");
        RpcClientProxy proxy = new RpcClientProxy(new RpcClientSocket(), config);
        UserService service = proxy.getProxy(UserService.class);

        for (int i = 0; i < 10; i++) {
            String user = service.getUser();
            System.out.println(user);
        }

    }

}
