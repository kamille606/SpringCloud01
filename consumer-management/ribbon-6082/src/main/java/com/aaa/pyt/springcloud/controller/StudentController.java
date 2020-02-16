package com.aaa.pyt.springcloud.controller;

import com.aaa.pyt.springcloud.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author ：pyt
 * @date ：Created in 2020/1/3 16:45
 * @version:
 * @description：
 */
@RestController
public class StudentController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/all")
    public List<Student> selectAllStudent() {
        return restTemplate.getForObject("http://BOOK-PROVIDER/selectAll", List.class);
    }

}