package com.quanla02.lab12.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(path = "/hello")
public class HelloController {

    
    @RequestMapping(value="message", method=RequestMethod.GET)
    public ResponseEntity<String> getMessage() {
        return ResponseEntity.ok().body("Hello Le Anh Quan PH16429");
    }


    @RequestMapping(value="/view", method=RequestMethod.GET)
    public String helloStringView() {
        return "hello";
    }
    
    @GetMapping(path = "/redirect")
    public RedirectView redirectView() {
        return new RedirectView("/about.html");
    }
    @GetMapping(path = "/forward")
    public ModelAndView forwardView(){
        return new ModelAndView("forward:/about.html");
    }

    @GetMapping(value="")
    @ResponseBody
    public String getMethodName(@RequestBody User user) {
        return "Hello, " +user.getName()+" - "+user.getId();
    }
    
}

class User{
    private String id;
    private String name;

    public User(){

    }
    public User(String id, String name){
        this.id = id;
        this.name = name;
    }
    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

}