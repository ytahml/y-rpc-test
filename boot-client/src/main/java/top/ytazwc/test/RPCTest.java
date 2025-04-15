package top.ytazwc.test;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.ytazwc.test.controller.UserController;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @author 00103943
 */
@State(Scope.Benchmark)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@BenchmarkMode(Mode.AverageTime)
@Warmup
@Measurement
public class RPCTest {


    UserController userController;

    @Setup
    public void setup() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BootClientApplication.class);
        userController = context.getBean(UserController.class);
    }

    @Benchmark
    @Fork(3)
    @OperationsPerInvocation(3)
    public void testRpc() {
        userController.testRpc();
    }

    @Benchmark
    @Fork(3)
    @OperationsPerInvocation(3)
    public void testLocal() {
        userController.testLocal();
    }

    @Benchmark
    @Fork(3)
    @OperationsPerInvocation(3)
    public void testHttp() {
        try {
            userController.testHttp();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(RPCTest.class.getSimpleName())
                .resultFormat(ResultFormatType.JSON)
                .result("/D:/data/result-rpc-avg-3.json")
                .build();

        new Runner(opt).run();
    }
}