package cn.itcast.action;

import cn.itcast.domain.User;
import cn.itcast.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Created by Gavin.Stevenson on 2016/12/30.
 */
public class UserAction extends ActionSupport implements ModelDriven {
    private User user = new User();
    @Override
    public User getModel()
    {
        return this.user;
    }
    //********************************************************************
    private UserService userService;
    public void setUserService(UserService userService)
    {
        this.userService = userService;
    }
    public String add()
    {
        this.userService.saveUser(user);
        return "add";
    }
}
