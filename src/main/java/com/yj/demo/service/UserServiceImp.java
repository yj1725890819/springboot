package com.yj.demo.service;

import com.yj.demo.dao.UserMapper;
import com.yj.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImp implements UserService {
    @Autowired(required = false)
    private UserMapper userMapper;
    public List<User> queryAll(){
        List<User> list = userMapper.queryAll();
        return list;
    }

}
