package com.hl.demo3;

public class MyTest {
    public static void main(String[] args) {
        Hose hose = new Hose();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setObject(hose);

        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }
}
