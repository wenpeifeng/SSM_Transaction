package com.ahead;

import com.ahead.pojo.Users;
import com.ahead.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void testUsers(){
        // 创建容器并启动
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_service.xml");
        UserService userService = (UserService) ac.getBean("userServiceImpl");
        int num = userService.insert(new Users(1,"文培凤","123456"));
    }
}
