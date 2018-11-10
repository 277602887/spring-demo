package com.springmvc.proxy;

import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

/**
 * @Description:
 * @Author: liuyuxiang
 * @Date: Created in 15:08 2018/11/10
 */
public class Client {
    public static void main(String[] args) {
        final Subject subject = new RealSubject();
        Subject proxy = (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (args.length > 0) {
                    System.out.println("args============" + args[0]);
                }
                Object invoke = method.invoke(subject, args);
                return invoke;
            }
        });
        System.out.println(proxy.getClass().getName());
        proxy.rent();
        String s = proxy.hello("hahahaha");
        System.out.println("==============" + s);
    }
}
