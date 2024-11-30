package com.YdaMooc.chapter06.dao.impl;

import com.YdaMooc.chapter06.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean login(String name, String password) {
        if (name.equals("张三") && password.equals("123")) {
            System.out.println("欢迎 " + name + " 登录成功");
            return true;
        }
        System.out.println("对不起 " + name + " 登录失败");
        return false;
    }
}
