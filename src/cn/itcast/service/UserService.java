package cn.itcast.service;

import cn.itcast.domain.User;

import java.util.List;

/**
 * Created by Gavin.Stevenson on 2016/12/19.
 */
public interface UserService {
    public void saveUser(User user);
    public void updateUser(User user);
    public void deleteUser(User user);
    public User findUserById(Integer id);
    public List<User> findAllUser();
}
