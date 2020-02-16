package com.aaa.pyt.springcloud.mapper;



import com.aaa.pyt.springcloud.model.Student;

import java.util.List;

public interface StudentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Student record);

    Student selectByPrimaryKey(Long id);

    List<Student> selectAll();

    int updateByPrimaryKey(Student record);
}