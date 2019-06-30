package com.yj.demo.service;

import com.yj.demo.entity.Login;

import java.util.List;
import java.util.Map;

public interface LoginService {
    Map<String, String> selectByPrimaryKey(Login login);
}