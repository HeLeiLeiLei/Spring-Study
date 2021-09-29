package com.hl.service;

import com.hl.dao.UserDao;
import com.hl.dao.UserDaoImpl;
import com.hl.dao.UserDaoSQServerImpl;
import com.hl.dao.UserMysqlDaoImpl;

public class UserServiceImpl implements UserService {
//    private UserDao userDao=new UserDaoImpl();
//    private UserDao userDao2=new UserMysqlDaoImpl();
//    private UserDao userDao3=new UserDaoSQServerImpl();


    private UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
