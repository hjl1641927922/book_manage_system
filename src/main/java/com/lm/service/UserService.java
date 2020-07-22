package com.lm.service;

import com.lm.pojo.User;
import org.springframework.stereotype.Service;

/**
 * @author super
 */
@Service
public interface UserService {
    /**
     * 查询是否有对应的用户信息
     * @param user
     * @return
     */
    User queryUser(User user);

    /**
     * 注册用户
     * @param user
     */
    void addUser(User user);
}
