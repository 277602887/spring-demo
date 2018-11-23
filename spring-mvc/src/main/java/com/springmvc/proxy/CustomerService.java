package com.springmvc.proxy;

/**
 * @Description:
 * @Author: liuyuxiang
 * @Date: Created in 21:28 2018/11/15
 */
public class CustomerService {
    private String name;
    private String url;

    public void printName() {
        System.out.println("==============姓名" + name);
    }

    public void printURL() {
        System.out.println("==============主页" + this.url);
        throw new RuntimeException("");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
