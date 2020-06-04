package com.sqlconnector.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class pageController {

    @RequestMapping("/index")
    public String goMain() {
        return "index";
    }

    @RequestMapping("index1")
    public String goMain1() {
        return "index1";
    }

    @RequestMapping("index2")
    public String goMain2() {
        return "index2";
    }

    @RequestMapping("index3")
    public String goMain3() {
        return "index3";
    }

    @RequestMapping("202/CommDisaster")
    public String go202() {
        return "202";
    }

    @RequestMapping("disasterRequest")
    public String goRequest() {
        return "disasterRequest";
    }
}
