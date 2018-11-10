package com.springmvc.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @Description: 监听在线人数
 * @Author: liuyuxiang
 * @Date: Created in 10:50 2018/11/7
 */
public class OnLineCount implements HttpSessionListener {

    private int count = 0;

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        count++;
        se.getSession().setAttribute("count", count);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        count--;
        se.getSession().setAttribute("count", count);
    }
}
