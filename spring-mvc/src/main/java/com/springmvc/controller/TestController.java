package com.springmvc.controller;

import com.springmvc.model.Employee;
import com.springmvc.proxy.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: liuyuxiang
 * @Date: Created in 15:43 2018/7/23
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    CustomerService customer;

    @RequestMapping("/json")
    @ResponseBody
    public Map<String, Object> xmlOrJson() {
        Map<String, Object> map = new HashMap<String, Object>();
//        service.printName();
//        service.printURL();
        String name = customer.getName();
        System.out.println(name);
        map.put("id", "1");
        map.put("name", "haha");
        return map;
    }

    @RequestMapping("/xmlOrJsonSimple")
    @ResponseBody
    public Employee xmlOrJsonSimple() {
        Employee e = new Employee();
        e.setId(1);
        e.setName("haha");
        return e;
    }
}
