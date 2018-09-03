package com.dw.model;

/**
 * @program: StudentManagerWeb
 * @description: 用于管理用户密码，账号的实体
 * @author: liu yan
 * @create: 2018-08-29 13:46
 */
public class User {
    private String username;
    private String password;
    private int id;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
