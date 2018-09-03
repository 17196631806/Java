package com.dw.service;

import com.dw.model.Student;

import java.util.List;

public interface StudentServer {
    public int addStudent(Student student);
    public List<Student> queryStudent();
    public void deleteStudent(Integer id);
    public Student modifyStudent(Integer id);
    public void updateStudent(Student student);
    public List<Student> findStudent(Integer id);
}
