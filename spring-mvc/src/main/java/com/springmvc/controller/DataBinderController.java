package com.springmvc.controller;

import com.springmvc.controller.model.Dept;
import com.springmvc.controller.model.Employee;
import com.springmvc.propertyeditors.CustomDeptEditor;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: liuyuxiang
 * @Date: Created in 15:43 2018/09/26
 */
@Controller
@RequestMapping("/binder")
public class DataBinderController {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
        binder.registerCustomEditor(Dept.class, new CustomDeptEditor());
    }

    @RequestMapping(value = "/testBoolean", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> testBoolean(boolean b) {
        Map<String, Object> map = new HashMap<String, Object>();
        if(b) {
            map.put("attr", "b is true");
        } else {
            map.put("attr", "b is false");
        }
        return map;
    }

    @RequestMapping(value = "/testObj", method = RequestMethod.GET)
    @ResponseBody
    public Employee testObj(Employee employee) {
        System.out.println(employee);
        return employee;
    }

    @RequestMapping(value = "/testDate", method = RequestMethod.GET)
    @ResponseBody
    public Date testDate(Date date) {
        System.out.println(date);
        return date;
    }
}
