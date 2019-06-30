package com.yj.demo.dao;

import com.yj.demo.entity.Login;

public interface LoginMapper {
    int deleteByPrimaryKey(String username);

    int insert(Login record);

    int insertSelective(Login record);

    Login selectByPrimaryKey(String username);

    int updateByPrimaryKeySelective(Login record);

    int updateByPrimaryKey(Login record);
}