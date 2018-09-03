package com.dw.service.impl;

import com.dw.dao.UserDao;
import com.dw.model.User;
import com.dw.service.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: StudentManagerWeb
 * @description:
 * @author: liu yan
 * @create: 2018-08-29 13:57
 */
@Service()
public class UserServerimpl implements UserServer {
    @Autowired
    private UserDao userDao;

    @Override
    public User UserChek(User user){
        return userDao.UserChek(user);
    }

    @Override
    public List<User> showAllUser() {
        return userDao.showAllUser();
    }

    @Override
    public void modifyPassword(Integer id) {
        userDao.modifyPassword(id);
    }
}
