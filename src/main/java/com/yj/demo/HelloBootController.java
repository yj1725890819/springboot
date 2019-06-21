package com.yj.demo;

import com.yj.demo.entity.User;
import com.yj.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloBootController {
    @Autowired

    private UserService userService;
    @RequestMapping( value="/api/yj/hello", method = RequestMethod.GET)

    public List<User> queryUserAll() {

        List<User> list = userService.queryAll();

        return list;

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
