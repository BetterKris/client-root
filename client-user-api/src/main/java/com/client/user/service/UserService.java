package com.client.user.service;

import com.client.user.entity.User;

import java.util.List;

public interface UserService {

    public List<User> list(User user);

    public User getById(Integer id);

    public Integer add(User user);

    public Integer update(User user);

    public Integer delete(Integer id);

}
