package com.quanla02.lab12.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class PathVariableController {

    @GetMapping({"/pathvariable","/pathvariable/{n}"})
    @ResponseBody
    public String getString(@PathVariable(required = false) String n) {
        return "==>" +n;
    }
    @GetMapping({"/{n}/pathvariable"})
    @ResponseBody
    public String getStringBefore(@PathVariable(required = false) String n) {
        return "==> " +n;
    }
    

}
