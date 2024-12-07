package com.YdaMooc.chatpter07.dao.impl;

import com.YdaMooc.chatpter07.dao.UserDao;
import com.YdaMooc.chatpter07.pojo.User;
import org.springframework.stereotype.Repository;

@Repository("myUserDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void save(User user) {
        System.out.println(user);
        System.out.println("执行UserDaoImpl.save(). 用户保存成功!");
    }
}
