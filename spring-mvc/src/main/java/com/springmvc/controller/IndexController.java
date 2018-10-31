package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Description:
 * @Author: liuyuxiang
 * @Date: Created in 18:42 2018/10/31
 */

@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping
    public ModelAndView index() {
        ModelAndView view = new ModelAndView("index");
        return view;
    }
}
