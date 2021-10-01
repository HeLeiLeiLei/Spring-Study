package com.hl.demo4;



import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

    private Object traget;
    public void setTraget(Object traget) {
        this.traget = traget;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),traget.getClass().getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object invoke = method.invoke(traget, args);
        return invoke;
    }

    public void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }
}
