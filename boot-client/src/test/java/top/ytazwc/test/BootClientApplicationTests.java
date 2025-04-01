package top.ytazwc.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.ytazwc.test.controller.UserController;

@SpringBootTest
class BootClientApplicationTests {

    @Autowired
    private UserController userController;

    @Test
    public void test1() {
        userController.testLocal();
    }

    @Test
    public void test2() {
        userController.testRpc();
    }

}
