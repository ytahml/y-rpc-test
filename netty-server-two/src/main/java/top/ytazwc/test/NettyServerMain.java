package top.ytazwc.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.ytazwc.rpc.annotations.RpcScan;
import top.ytazwc.rpc.transport.netty.server.RpcServerNetty;

/**
 * @author 花木凋零成兰
 * @title NettyServerMain
 * @date 2025-03-28 19:56
 * @package top.ytazwc.test
 * @description
 */
@RpcScan("top.ytazwc")
public class NettyServerMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(NettyServerMain.class);
        RpcServerNetty bean = context.getBean(RpcServerNetty.class);
        bean.start();
    }

}
