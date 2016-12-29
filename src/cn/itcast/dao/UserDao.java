package cn.itcast.dao;

import cn.itcast.domain.User;

import java.util.List;

/**
 * Created by Gavin.Stevenson on 2016/12/18.
 */
public interface UserDao {
    public void save(User user);
    public void update(User user);
    public void delete(User user);
    public User findById(Integer id);
    public List<User>findAll();
}
