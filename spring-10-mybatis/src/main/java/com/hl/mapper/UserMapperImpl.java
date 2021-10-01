package com.hl.mapper;

import com.hl.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserMapperImpl implements UserMapper {


    private SqlSessionTemplate sqlSession;
    @Autowired
    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> queryUsers() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.queryUsers();
        return userList;
    }
}
