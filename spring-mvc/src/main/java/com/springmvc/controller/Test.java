package com.springmvc.controller;

import com.springmvc.controller.model.Employee;
import org.springframework.beans.BeanWrapperImpl;

/**
 * @Description:
 * @Author: liuyuxiang
 * @Date: Created in 10:31 2018/8/17
 */
public class Test {
    public static void main(String[] args) {
        Employee e = new Employee();
        BeanWrapperImpl bw = new BeanWrapperImpl(e);
        bw.setPropertyValue("good", "on");
//        bw.setPropertyValue("good", "1");
//        bw.setPropertyValue("good", "true");
//        bw.setPropertyValue("good", "yes");
//        bw.setWrappedInstance(e);
//        bw.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
//        bw.setPropertyValue("birth", "1990-01-01");
        System.out.println(e);
    }
}
