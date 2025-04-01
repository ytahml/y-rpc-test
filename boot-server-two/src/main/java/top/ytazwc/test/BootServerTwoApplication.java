package top.ytazwc.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import top.ytazwc.rpc.annotations.RpcScan;
import top.ytazwc.rpc.transport.netty.server.RpcServerNetty;

@RpcScan({"top.ytazwc"})
@SpringBootApplication
public class BootServerTwoApplication implements CommandLineRunner {

    @Autowired
    private RpcServerNetty netty;

    @Override
    public void run(String... args) throws Exception {
        netty.start();
    }

    public static void main(String[] args) {
        SpringApplication.run(BootServerTwoApplication.class, args);
    }

}
