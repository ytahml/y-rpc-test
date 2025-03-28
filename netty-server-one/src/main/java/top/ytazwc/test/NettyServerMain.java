package top.ytazwc.test;

import top.ytazwc.rpc.config.RpcServiceConfig;
import top.ytazwc.rpc.transport.netty.server.RpcServerNetty;
import top.ytazwc.test.service.UserService;
import top.ytazwc.test.service.impl.UserServiceImpl;

/**
 * @author 00103943
 * @date 2025-03-28 16:51
 * @package top.ytazwc.test
 * @description
 */
public class NettyServerMain {
    public static void main(String[] args) {
        RpcServerNetty netty = new RpcServerNetty();
        UserService userService = new UserServiceImpl();
        RpcServiceConfig config = RpcServiceConfig.builder()
                .version("2.0.0")
                .group("netty")
                .service(userService)
                .build();
        netty.registerService(config);
        netty.start();
    }
}