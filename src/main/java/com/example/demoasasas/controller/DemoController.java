package com.example.demoasasas.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("")
    private ResponseEntity<?> test() {
        return new ResponseEntity<Object>("success", HttpStatus.OK);
    }

}
