package com.springmvc.binder;

import com.springmvc.controller.model.Dept;
import com.springmvc.propertyeditors.CustomDeptEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

/**
 * @Description:
 * @Author: liuyuxiang
 * @Date: Created in 16:49 2018/9/27
 */
@ControllerAdvice
public class InitBinderControllerAdvice {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Dept.class, new CustomDeptEditor());
    }
}
