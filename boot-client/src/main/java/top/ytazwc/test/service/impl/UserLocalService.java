package top.ytazwc.test.service.impl;

import org.springframework.stereotype.Service;
import top.ytazwc.test.service.UserService;

/**
 * @author 00103943
 * @date 2025-04-01 17:12
 * @package top.ytazwc.test.service.impl
 * @description
 */
@Service("userLocalService")
public class UserLocalService implements UserService {
    @Override
    public String getUser() {
        return "User Local Service one";
    }
}
