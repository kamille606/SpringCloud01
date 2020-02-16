package com.aaa.pyt.springcloud.service;

import com.aaa.pyt.springcloud.mapper.StudentMapper;
import com.aaa.pyt.springcloud.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;
    /**
    * @Description:
     *      查询所有学生信息
    * @Param:  * @param null
    * @Return:
    * @Date: 2019/11/8
    */
    public List<Student> selectAll(){
        return studentMapper.selectAll();
    }
}
