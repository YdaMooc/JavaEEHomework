package com.YdaMooc;

import com.YdaMooc.chatpter07.controller.UserController;
import com.YdaMooc.chatpter07.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserAnnotationTest {
    @Test
    public void savteTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController controller = (UserController)context.getBean("myUserController");
        User user = (User)context.getBean("myUser");
        controller.save(user);
    }
}
