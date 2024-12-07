package com.YdaMooc.chatpter07.service.impl;

//import jakarta.annotation.Resource;
import com.YdaMooc.chatpter07.dao.UserDao;
import com.YdaMooc.chatpter07.pojo.User;
import com.YdaMooc.chatpter07.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("myUserService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void save(User user) {
        this.userDao.save(user);
        System.out.println("执行UserServiceImpl.save()");
    }
}
