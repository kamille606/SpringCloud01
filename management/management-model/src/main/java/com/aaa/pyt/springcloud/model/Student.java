package com.aaa.pyt.springcloud.model;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {
    private Long id;

    private String stuName;

    private String stuAge;

    private String stuClass;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public String getStuAge() {
        return stuAge;
    }

    public void setStuAge(String stuAge) {
        this.stuAge = stuAge == null ? null : stuAge.trim();
    }

    public String getStuClass() {
        return stuClass;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass == null ? null : stuClass.trim();
    }

    @Override
    public String
    toString() {
        return "Student{" +
                "id=" + id +
                ", stuName='" + stuName + '\'' +
                ", stuAge='" + stuAge + '\'' +
                ", stuClass='" + stuClass + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) &&
                Objects.equals(stuName, student.stuName) &&
                Objects.equals(stuAge, student.stuAge) &&
                Objects.equals(stuClass, student.stuClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stuName, stuAge, stuClass);
    }
}