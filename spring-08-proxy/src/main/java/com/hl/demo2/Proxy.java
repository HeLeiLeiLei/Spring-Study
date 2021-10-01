package com.hl.demo2;

public class Proxy implements UserService {

    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void addUser() {
        log("add");
        userService.addUser();
    }

    public void deleteUser() {
        log("delete");
        userService.addUser();
    }

    public void updateUser() {
        log("update");
        userService.addUser();
    }

    public void queryUser() {
        log("query");
        userService.addUser();
    }

    public void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }
}
