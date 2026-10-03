package com.example.aws_demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping
    public ResponseEntity<String> success() {
        return ResponseEntity.status(HttpStatus.OK).body("Success");
    }
}
