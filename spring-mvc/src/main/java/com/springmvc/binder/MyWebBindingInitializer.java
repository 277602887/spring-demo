package com.springmvc.binder;

import com.springmvc.model.Dept;
import com.springmvc.propertyeditors.CustomDeptEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

/**
 * @Description:
 * @Author: liuyuxiang
 * @Date: Created in 16:16 2018/9/27
 */
public class MyWebBindingInitializer implements WebBindingInitializer {

    @Override
    public void initBinder(WebDataBinder binder, WebRequest request) {
        binder.registerCustomEditor(Dept.class, new CustomDeptEditor());
    }
}
