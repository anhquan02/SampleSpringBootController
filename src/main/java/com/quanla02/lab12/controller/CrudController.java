package com.quanla02.lab12.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/crud")
public class CrudController {

    @GetMapping(path = "")
    public ResponseEntity<String> getMethod() {
        return ResponseEntity.ok().body("Get Lê Anh Quân - PH16429");
    }
    @PostMapping(path = "")
    public ResponseEntity<String> postMethod() {
        return ResponseEntity.ok().body("Post Lê Anh Quân - PH16429");
    }
    @PutMapping(path = "")
    public ResponseEntity<String> putMethod() {
        return ResponseEntity.ok().body("Put Lê Anh Quân - PH16429");
    }
    @DeleteMapping(path = "")
    public ResponseEntity<String> deleteMethod() {
        return ResponseEntity.ok().body("Delete Lê Anh Quân - PH16429");
    }

    
}
