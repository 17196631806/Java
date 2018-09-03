package com.dw.dao;

import com.dw.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    User UserChek(User user);
    List<User> showAllUser();// 显示所有管理
}
