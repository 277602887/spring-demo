package com.springmvc.listener;

/**
 * @Description:
 * @Author: liuyuxiang
 * @Date: Created in 14:56 2018/11/7
 */
public class Person {

    private PersonListener listener;

    public void registerListener(PersonListener personListener) {
        this.listener = personListener;
    }

    public void run() {
        if (listener != null) {
            Even even = new Even(this);
            this.listener.dorun(even);
        }
        System.out.println("人具有跑的方法");
    }

    public void eat() {
        if (listener != null) {
            Even even = new Even(this);
            this.listener.doeat(even);
        }
        System.out.println("人具有吃的方法");
    }
}
