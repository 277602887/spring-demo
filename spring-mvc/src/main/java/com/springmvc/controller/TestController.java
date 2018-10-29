package com.springmvc.controller;

import com.springmvc.controller.model.Employee;
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
@RequestMapping("/index")
public class TestController {

    @RequestMapping("/xmlOrJson")
    @ResponseBody
    public Map<String, Object> xmlOrJson() {
        Map<String, Object> map = new HashMap<String, Object>();
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
