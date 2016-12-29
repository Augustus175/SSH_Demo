package cn.itcast.service.impl;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;
import cn.itcast.service.UserService;

import java.util.List;

/**
 * Created by Gavin.Stevenson on 2016/12/19.
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void saveUser(User user) {
        this.userDao.save(user);
    }

    public void updateUser(User user) {
        this.userDao.save(user);
    }

    public void deleteUser(User user) {
        this.userDao.delete(user);
    }

    public User findUserById(Integer id) {
        return this.findUserById(id);
    }

    public List<User> findAllUser() {
        return this.userDao.findAll();
    }

}
