package com.dw.service;

import com.dw.model.User;

import java.util.List;

public interface UserServer {
    User UserChek(User user);
    List<User> showAllUser();// 显示所有管理
}
