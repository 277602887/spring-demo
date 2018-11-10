package com.springmvc.listener;

/**
 * @Description:
 * @Author: liuyuxiang
 * @Date: Created in 15:24 2018/11/7
 */
public class TestListener {

    public static void main(String[] args) {
        Person person = new Person();
        person.registerListener(new MyPersonListener());
        person.run();
        person.eat();
    }
}
