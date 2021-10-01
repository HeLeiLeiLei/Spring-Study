package com.hl.service;

import org.springframework.stereotype.Component;


@Component
public class UserServiceImpl implements UserService {
    public void addUser() {
        System.out.println("addUser");
    }

    public void deleteUser() {
        System.out.println("deleteUser");
    }

    public void updateUser() {
        System.out.println("updateUser");
    }

    public void queryUser() {
        System.out.println("queryUser");
    }
}
