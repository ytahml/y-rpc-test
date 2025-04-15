package top.ytazwc.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import top.ytazwc.rpc.annotations.RpcReference;
import top.ytazwc.test.service.UserService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author 00103943
 * @date 2025-04-01 17:13
 * @package top.ytazwc.test.controller
 * @description
 */
@Controller
public class UserController {

    @Autowired
    @Qualifier("userLocalService")
    private UserService userLocalService;

    @RpcReference(version = "1.1.1", group = "test")
    private UserService userService;

    public void testRpc() {
        userService.getUser();
    }

    public void testLocal() {
        userLocalService.getUser();
    }

    public void testHttp() throws IOException {
        // 创建URL对象
        URL url = new URL("https://jsonplaceholder.typicode.com/posts/1");

        // 打开连接
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // 设置请求方法为GET
        connection.setRequestMethod("GET");

        // 获取响应码
        int responseCode = connection.getResponseCode();

        // 打印响应码
        System.out.println("响应码: " + responseCode);

        // 如果响应码为200，则读取响应内容
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            // 关闭流
            in.close();

            // 打印响应内容
            System.out.println("响应内容: " + content.toString());
        } else {
            System.out.println("GET请求失败");
        }

        // 断开连接
        connection.disconnect();
    }

}
