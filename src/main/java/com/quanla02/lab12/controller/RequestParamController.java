package com.quanla02.lab12.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(path = "/requestparam")
public class RequestParamController {
    

    @GetMapping(value="")
    @ResponseBody
    public String getMethodName(@RequestParam String name) {
        return "Name: " + name;
    }
    

}
