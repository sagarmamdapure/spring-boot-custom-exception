package com.example.customexception.controller;

import com.example.customexception.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("student")
public class DemoController {

    @GetMapping
    public List<Student> getStudent() {
        throw new IllegalStateException("Oops exception occurred");
    }
}
