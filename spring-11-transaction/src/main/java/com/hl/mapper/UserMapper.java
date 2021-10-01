package com.hl.mapper;

import com.hl.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> queryUsers();

    int addUser(User user);

    int deleteUser(int id);
}
