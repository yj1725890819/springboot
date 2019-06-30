package com.yj.demo.service;

import com.yj.demo.dao.LoginMapper;
import com.yj.demo.entity.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LoginServiceImp implements LoginService {
    @Autowired(required = false)
    private LoginMapper loginMapper;
    public Map<String, String>  selectByPrimaryKey(Login login ){
        System.out.println(login.getAge());
        Login loginss = loginMapper.selectByPrimaryKey(login.getUsername());
        System.out.println(login.getAge());
        if(login.getPassword().equals(loginss.getPassword()))
        {
            Map<String,String> map=new HashMap();
            map.put("status","ok");
            map.put("type","account");
            map.put("currentAuthority",loginss.getUsername());
            return map;
        }else
        {
            Map<String,String> map=new HashMap();
            map.put("status","error");
            map.put("type","account");
            map.put("currentAuthority","guest");
            return map;
        }
    }
}
