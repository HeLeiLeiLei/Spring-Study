package com.hl.mapper;

import com.hl.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Component;

import java.util.List;


public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    public List<User> queryUsers() {
        List<User> userList = getSqlSession().getMapper(UserMapper.class).queryUsers();
        return userList;
    }
}
