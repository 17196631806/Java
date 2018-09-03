package com.dw.dao;

import com.dw.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    public User UserChek(User user);
    public List<User> showAllUser();// 显示所有管理
    public void modifyPassword(Integer id);
}
