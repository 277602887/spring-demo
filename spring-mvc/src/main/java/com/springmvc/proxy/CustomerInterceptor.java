package com.springmvc.proxy;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


/**
 * @Description:
 * @Author: liuyuxiang
 * @Date: Created in 21:28 2018/11/15
 */
public class CustomerInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        try {
            Object result = methodInvocation.proceed();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
