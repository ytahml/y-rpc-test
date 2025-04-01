package top.ytazwc.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import top.ytazwc.rpc.annotations.RpcScan;

@RpcScan({"top.ytazwc"})
@SpringBootApplication
public class BootClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootClientApplication.class, args);
    }

}
