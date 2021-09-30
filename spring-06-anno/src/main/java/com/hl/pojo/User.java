package com.hl.pojo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component 就相当于 <bean id="user" class="com.hl.pojo.User"/>
@Component
public class User {

    public String name;

    @Value("小何")
    public void setName(String name) {
        this.name = name;
    }
}
