package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * @Description:
 * @Author: liuyuxiang
 * @Date: Created in 18:42 2018/10/31
 */

@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping(value = "/table", method = RequestMethod.GET)
    public ModelAndView table(HttpServletRequest request) {
        System.out.println("=====================/index/table");
        Object count = request.getSession().getAttribute("count");
        ModelAndView view = new ModelAndView("table");
        view.addObject("count", count);
        view.addObject("time", new Date());
        view.addObject("face", "haha");
        return view;
    }
}
