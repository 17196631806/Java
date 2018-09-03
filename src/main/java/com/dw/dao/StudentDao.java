package com.dw.dao;

import com.dw.model.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentDao {
    public int addStudent(Student student);
    public List<Student> queryStudent();
    public void deleteStudent(Integer id);
    public Student modifyStudent(Integer id);
    public void updateStudent(Student student);
    public List<Student> findStudent(Integer id);
}
