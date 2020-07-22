package com.lm.mapper;

import com.lm.pojo.User;

/**
 * @author super
 */
public interface UserMapper {
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
