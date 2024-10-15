package com.example.service;


import com.example.pojo.User;

public interface UserService {
//根据用户名查询
    User findByUsername(String username);
//注册
    void register(String username, String password);
    void update(User user);
//更新头像
    void updateAvatar(String avatarUrl);

    void updatePwd(String newPwd);
}
