package com.aaa.pyt.springcloud.controller;

import com.aaa.pyt.springcloud.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping("/selectAll")
    public List<Student> selectAll(){

        return restTemplate.getForObject("http://localhost:8081/selectAll",List.class);
    }
}
