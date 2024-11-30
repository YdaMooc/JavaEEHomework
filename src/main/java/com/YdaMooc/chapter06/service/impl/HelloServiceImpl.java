package com.YdaMooc.chapter06.service.impl;

import com.YdaMooc.chapter06.dao.UserDao;
import com.YdaMooc.chapter06.service.HelloService;

public class HelloServiceImpl implements HelloService {
    private String userName;
    UserDao userDao;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void show() {
        System.out.println(userName + "欢迎来到Spring框架的世界!");
    }

    @Override
    public boolean login(String name, String password) {
        return userDao.login(name, password);
    }
}
