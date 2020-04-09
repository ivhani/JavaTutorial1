package com.example.demo4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Ivhani Maselesele
 * @email ivhani.maselesele@gmail.com
 * @date 2020/04/08
 */

@Controller
public class TestController {

    @GetMapping("/")
    public ModelAndView test() {
        int a = 5;
        double ab = 5.5;
        boolean c = true;
        String b = "index";
        String name  = "ivhani";
        return new ModelAndView(b);
    }
}
