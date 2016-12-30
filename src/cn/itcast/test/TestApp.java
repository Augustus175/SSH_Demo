package cn.itcast.test;

import cn.itcast.dao.impl.UserDaoImpl;
import cn.itcast.domain.User;
import cn.itcast.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gavin.Stevenson on 2016/12/27.
 */
public class TestApp {
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("jack");
        user.setPassword("1234");
        User user2 = new User();
        user2.setUsername("jack");
        user2.setPassword("1234");
        String xmlPatth = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPatth);
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.saveUser(user);
        userService.saveUser(user2);
        UserDaoImpl usi = new UserDaoImpl();
        List<User> userlist = new ArrayList<>();
        userlist = usi.findAll();
        for(User u:userlist)
        {
            System.out.println(u.getId()+" "+u.getUsername()+" "+u.getPassword());
        }

    }
}

