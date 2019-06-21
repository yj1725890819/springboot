package com.yj.demo.dao;

import com.yj.demo.entity.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);
    List<User> queryAll();
    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}