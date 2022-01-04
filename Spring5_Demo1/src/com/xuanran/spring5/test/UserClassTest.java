package com.xuanran.spring5.test;

import com.xuanran.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created By XuanRan on 2022/1/4
 */
public class UserClassTest {

    @Test
    public void TestAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("UserBeanConfig.xml");
        User user = context.getBean("user",User.class);
        user.add();

    }
}
