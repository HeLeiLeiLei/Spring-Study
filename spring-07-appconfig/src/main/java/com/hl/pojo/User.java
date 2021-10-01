package com.hl.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {

    private String name;

    @Autowired
    private Cat cat;

    public User() {
        System.out.println("无参构造:User实例化");
    }

    public String getName() {
        return name;
    }

    @Value("小何")
    public void setName(String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }


    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", cat=" + cat +
                '}';
    }
}
