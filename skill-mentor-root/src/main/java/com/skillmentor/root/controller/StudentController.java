package com.skillmentor.root.controller;


import com.skillmentor.root.service.impl.StudentServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class StudentController {
    static StudentServiceImpl studentService = new StudentServiceImpl();
}
