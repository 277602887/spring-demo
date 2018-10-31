package com.springmvc.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description:
 * @Author: liuyuxiang
 * @Date: Created in 15:45 2018/9/27
 */
@Data
public class Dept implements Serializable{

    private int id;

    private String name;
}
