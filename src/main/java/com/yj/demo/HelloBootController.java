package com.yj.demo;

import com.yj.demo.entity.Login;
import com.yj.demo.entity.User;
import com.yj.demo.service.LoginService;
import com.yj.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@RestController
public class HelloBootController {
    @Autowired
    private UserService userService;
    @Autowired
    private LoginService loginService;
    @RequestMapping( value="/api/yj/hello", method = RequestMethod.GET)

    public List<User> queryUserAll() {

        List<User> list = userService.queryAll();

        return list;

    }
    @RequestMapping( value="/api/yj/login", method = RequestMethod.POST)
    public Map<String, String> selectByPrimaryKey(@RequestBody Login login) {
        System.out.println(login.toString());
        System.out.println(login.getUsername());
        Map<String, String> map= loginService.selectByPrimaryKey(login);
        return map ;
    }
//    public List<Map<String, String>> sayHello(){
//        Map<String,String> map=new HashMap<String,String>();
//        ArrayList<Map<String,String>> arrayList=new ArrayList<Map<String,String>>();
//        map.put("id","00001");
//        map.put("custNo","001");
//        map.put("custNm","重庆农村商业银行");
//        arrayList.add(map);
//        return  arrayList;
//    }
}
