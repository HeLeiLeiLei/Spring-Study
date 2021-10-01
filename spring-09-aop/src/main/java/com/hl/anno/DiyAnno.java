package com.hl.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DiyAnno {

    @Before("execution(* com.hl.service.UserServiceImpl.*(..))")
    public void bfroe(){
        System.out.println("方法执行前");
    }

    @After("execution(* com.hl.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("方法执行后");
    }

    @Around("execution(* com.hl.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前");
        Signature signature = joinPoint.getSignature();//获得签名
        Object proceed = joinPoint.proceed();//执行方法
        System.out.println("环绕后");
        System.out.println(signature);
    }
}
