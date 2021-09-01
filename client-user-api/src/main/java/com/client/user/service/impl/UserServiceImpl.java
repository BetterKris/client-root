package com.client.user.service.impl;

import com.client.user.entity.User;
import com.client.user.mapper.UserMapper;
import com.client.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<User> list(User user) {
        return userMapper.list(user);
    }

    public User getById(Integer id) {
        return userMapper.getById(id);
    }

    public Integer add(User user) {
        return userMapper.add(user);
    }

    public Integer update(User user) {
        return userMapper.update(user);
    }

    public Integer delete(Integer id) {
        return userMapper.delete(id);
    }

}
