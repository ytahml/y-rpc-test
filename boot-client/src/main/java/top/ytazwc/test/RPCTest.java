package top.ytazwc.test;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.ytazwc.test.controller.UserController;

import java.util.concurrent.TimeUnit;

/**
 * @author 00103943
 */
@State(Scope.Benchmark)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@BenchmarkMode(Mode.Throughput)
@Warmup(time = 5, timeUnit = TimeUnit.MILLISECONDS)
@Measurement(time = 5, timeUnit = TimeUnit.MILLISECONDS)
public class RPCTest {


    UserController userController;

    @Setup
    public void setup() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BootClientApplication.class);
        userController = context.getBean(UserController.class);
    }

    @Benchmark
    @Fork(1)
    @OperationsPerInvocation(3)
    public void testRpc() {
        userController.testRpc();
    }

    @Benchmark
    @Fork(1)
    @OperationsPerInvocation(3)
    public void testLocal() {
        userController.testLocal();
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(RPCTest.class.getSimpleName())
                .resultFormat(ResultFormatType.JSON)
                .result("/E:/data/result-rpc.json")
                .build();

        new Runner(opt).run();
    }
}