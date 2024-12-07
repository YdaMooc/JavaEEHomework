package com.YdaMooc.chatpter07.controller;

import com.YdaMooc.chatpter07.pojo.User;
import com.YdaMooc.chatpter07.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("myUserController")
public class UserController {

    @Autowired
    private UserService userService;

    public void save(User user){
        this.userService.save(user);
        System.out.println("执行UserController.save()");
    }
}
