package com.YdaMooc.chapter06;

import com.YdaMooc.chapter06.service.HelloService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class helloTest {

    @Test
    public void showTest() {
        // 初始化spring容器，加载applicationContext.xml配置
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 通过容器获取配置中helloService的实例
        HelloService helloService = (HelloService) applicationContext.getBean("helloService");
        // 调用Service层接口方法
        helloService.show();
    }

    @Test
    public void loginTest() {
        // 初始化spring容器，加载applicationContext.xml配置
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 通过容器获取配置中helloService的实例
        HelloService helloService = (HelloService) applicationContext.getBean("helloService");
        // 调用Service层接口方法
        helloService.login("张三", "123");
    }
}
