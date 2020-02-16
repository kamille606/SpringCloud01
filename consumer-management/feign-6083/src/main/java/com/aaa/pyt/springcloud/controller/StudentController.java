package com.aaa.pyt.springcloud.controller;

import com.aaa.pyt.springcloud.model.Student;
import com.aaa.pyt.springcloud.service.ISpringCloudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：pyt
 * @date ：Created in 2020/1/4 14:17
 * @version:
 * @description：
 */
@RestController
public class StudentController {

    @Autowired
    private ISpringCloudService springCloudService;

    @GetMapping("/selectAll")
    public List<Student> selectAll() {
        return springCloudService.selectAll();
    }

}
