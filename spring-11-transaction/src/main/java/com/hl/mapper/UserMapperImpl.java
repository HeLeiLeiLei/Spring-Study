package com.hl.mapper;

import com.hl.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
public class UserMapperImpl implements UserMapper {

    //@Autowired
    private SqlSessionTemplate sqlSession;
    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> queryUsers() {
        List<User> userList = sqlSession.getMapper(UserMapper.class).queryUsers();
        User user = new User(5, "小⑤", "888888");
        addUser(user);
        deleteUser(5);
        return userList;
    }

    public int addUser(User user) {
        return sqlSession.getMapper(UserMapper.class).addUser(user);
    }

    public int deleteUser(int id) {
        return sqlSession.getMapper(UserMapper.class).deleteUser(id);
    }
}
