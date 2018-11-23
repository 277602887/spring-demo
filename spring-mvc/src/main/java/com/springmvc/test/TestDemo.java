package com.springmvc.test;

import com.springmvc.proxy.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author: liuyuxiang
 * @Date: Created in 10:33 2018/10/31
 */
public class TestDemo {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring/dispatcher-servlet.xml");
        CustomerService obj = (CustomerService) context.getBean("customerInterceptorProxy");

        System.out.println("****************");
        obj.printName();
        System.out.println("****************");
        obj.printURL();
        System.out.println("****************");

    }
}
