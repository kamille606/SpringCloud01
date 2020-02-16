package com.aaa.pyt.springcloud.controller;


import com.aaa.pyt.springcloud.model.Student;
import com.aaa.pyt.springcloud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/selectAll")
    public List<Student> selectAll(){
        return studentService.selectAll();
    }
}
