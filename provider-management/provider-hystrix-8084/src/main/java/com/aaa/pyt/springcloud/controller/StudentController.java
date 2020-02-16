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
    public List<Student> selectAll() throws Exception {
        List<Student> bookList = studentService.selectAll();
        if(bookList.size() > 0) {
            // 说明数据库中有数据，有数据则抛异常
            throw new Exception("故意抛出异常！");
        }
        return bookList;
    }
}
