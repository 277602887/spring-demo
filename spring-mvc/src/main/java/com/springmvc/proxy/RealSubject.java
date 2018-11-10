package com.springmvc.proxy;

/**
 * @Description:
 * @Author: liuyuxiang
 * @Date: Created in 15:05 2018/11/10
 */
public class RealSubject implements Subject {

    @Override
    public void rent() {
        System.out.println("I want to rent my house");
    }

    @Override
    public String hello(String str) {
        System.out.println("hello: " + str);
        return  str;
    }
}
