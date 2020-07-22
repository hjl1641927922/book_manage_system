package com.lm.service;

import com.lm.mapper.UserMapper;
import com.lm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author super
 */
@Service
public class UserServiceImpl implements UserService{
    private UserMapper userMapper;

    @Autowired
    @Qualifier("userMapper")
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User queryUser(User user) {
       return userMapper.queryUser(user);
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }
}
