package top.ytazwc.test.service.impl;

import top.ytazwc.rpc.annotations.RpcService;
import top.ytazwc.test.service.UserService;

/**
 * @author 00103943
 * @date 2025-03-31 10:44
 * @package top.ytazwc.test.service.impl
 * @description
 */
@RpcService(version = "1.1.1", group = "test")
public class UserServiceImpl implements UserService {
    @Override
    public String getUser() {
        return "User RPC Service two";
    }
}
