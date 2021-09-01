package com.client.user.mapper;

import com.client.user.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    List<User> list(User user);

    User getById(Integer id);

    Integer add(User user);

    Integer update(User user);

    Integer delete(Integer id);

}
