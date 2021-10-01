package com.hl.demo4;


import org.junit.Test;

public class MyTest {
    @Test
    public void Test(){
        UserServiceImpl userService = new UserServiceImpl();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTraget(userService);
        UserService proxy = (UserService) pih.getProxy();
        proxy.deleteUser();
    }
}
