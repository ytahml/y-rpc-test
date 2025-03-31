package top.ytazwc.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import top.ytazwc.rpc.annotations.RpcScan;
import top.ytazwc.rpc.transport.netty.server.RpcServerNetty;

/**
 * @author 00103943
 */
@RpcScan({"top.ytazwc"})
@SpringBootApplication
public class BootServerOneApplication implements CommandLineRunner {

    @Autowired
    private RpcServerNetty netty;

    public static void main(String[] args) {
        SpringApplication.run(BootServerOneApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        this.netty.start();
    }
}
