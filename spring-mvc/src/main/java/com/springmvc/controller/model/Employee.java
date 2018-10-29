package com.springmvc.controller.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description:
 * @Author: liuyuxiang
 * @Date: Created in 14:39 2018/8/21
 */
@Data
public class Employee implements Serializable {

    private Integer id;

    private String name;

    private boolean good;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birth;

    private Dept dept;
}
