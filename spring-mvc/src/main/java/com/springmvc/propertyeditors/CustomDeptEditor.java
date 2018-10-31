package com.springmvc.propertyeditors;

import com.springmvc.model.Dept;

import java.beans.PropertyEditorSupport;

/**
 * @Description:
 * @Author: liuyuxiang
 * @Date: Created in 15:44 2018/9/27
 */
public class CustomDeptEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws java.lang.IllegalArgumentException {
        if(text.indexOf(",") > 0) {
            Dept dept = new Dept();
            String[] arr = text.split(",");
            dept.setId(Integer.parseInt(arr[0]));
            dept.setName(arr[1]);
            setValue(dept);
        } else {
            throw new IllegalArgumentException("dept param is error");
        }
    }
}
