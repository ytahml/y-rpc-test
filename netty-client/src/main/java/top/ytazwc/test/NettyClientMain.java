package top.ytazwc.test;

import top.ytazwc.rpc.config.RpcServiceConfig;
import top.ytazwc.rpc.transport.netty.client.RpcClientNetty;
import top.ytazwc.rpc.transport.proxy.RpcClientProxy;
import top.ytazwc.test.service.UserService;

/**
 * @author 00103943
 * @date 2025-03-28 17:01
 * @package top.ytazwc.test
 * @description
 */
public class NettyClientMain {
    public static void main(String[] args) {
        RpcServiceConfig config = RpcServiceConfig.builder()
                .version("2.0.0")
                .group("netty")
                .build();
        RpcClientProxy proxy = new RpcClientProxy(new RpcClientNetty(), config);
        UserService userService = proxy.getProxy(UserService.class);
        System.out.println(userService.getUser());
    }
}