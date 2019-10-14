package com.cb.dao;

import com.cb.pojo.User;

import java.util.List;

public interface Usermapper {


    User selectUser(int id);


    //插入
    public int add(User user);

    //删除
    int delete(int id);

    //更新
    int update(User user);
    //查询所有
    List<User> getAll();






}
