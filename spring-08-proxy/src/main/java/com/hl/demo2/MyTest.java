package com.hl.demo2;

import org.junit.Test;

public class MyTest {
    @Test
    public void Test1(){
        UserServiceImpl userService = new UserServiceImpl();
        Proxy proxy = new Proxy();
        proxy.setUserService(userService);
        proxy.addUser();
    }
}
