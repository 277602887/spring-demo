package com.springmvc.listener;

/**
 * @Description:
 * @Author: liuyuxiang
 * @Date: Created in 15:22 2018/11/7
 */
public class MyPersonListener implements PersonListener {
    @Override
    public void dorun(Even even) {
        System.out.println("穿鞋穿鞋穿鞋");
    }

    @Override
    public void doeat(Even even) {
        System.out.println("洗手洗手洗手");
    }
}
