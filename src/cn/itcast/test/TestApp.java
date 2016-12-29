package cn.itcast.test;

import cn.itcast.domain.User;
import cn.itcast.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Gavin.Stevenson on 2016/12/27.
 */
public class TestApp {
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("jack");
        user.setPassword("1234");
        String xmlPatth = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPatth);
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.saveUser(user);
    }
}

