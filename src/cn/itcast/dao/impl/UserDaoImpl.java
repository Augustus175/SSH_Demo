package cn.itcast.dao.impl;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;
import org.springframework.orm.hibernate3.HibernateTemplate;

import java.util.List;

/**
 * Created by Gavin.Stevenson on 2016/12/18.
 */
public class UserDaoImpl implements UserDao {
    private HibernateTemplate hibernateTemplate;

    private String hql = "from User";


    public void setHibernateTemplate(HibernateTemplate hibernateTemplate)
    {
        this.hibernateTemplate = hibernateTemplate;
    }
    public User findById (Integer id)
    {
        return hibernateTemplate.get(User.class, id);
    }
    public List<User> findAll(){
//        Query query = getSession().createQuery(this.hql.toString());
//        return query.list();
        //return this.hibernateTemplate.find("from User");
//        return

        //this.hibernateTemplate.fin
        return this.hibernateTemplate.find(this.hql);
    }
    public void save(User user)
    {
        this.hibernateTemplate.save(user);
    }

    public void update(User user)
    {
        this.hibernateTemplate.update(user);
    }
    public void delete(User user)
    {
        this.hibernateTemplate.delete(user);
    }

}
