package com.dw.service;

import com.dw.model.User;

import java.util.List;

public interface UserServer {
    public User UserChek(User user);
    public List<User> showAllUser();// 显示所有管理
    public void modifyPassword(Integer id);
}
