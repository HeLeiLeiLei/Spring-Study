package com.hl.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.PublicKey;

@Data
public class User {
    private String name;

    public User(){
        System.out.println("无参构造:User已创建");
    }

    public User(String name){
        System.out.println("有参构造:User已创建");
        this.name=name;
    }

    public void sys(){
        System.out.println("name:"+name);
    }
}
