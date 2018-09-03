package com.dw.service.impl;

import com.dw.dao.StudentDao;
import com.dw.model.Student;
import com.dw.service.StudentServer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: StudentManagerWeb
 * @description:
 * @author: liu yan
 * @create: 2018-08-30 17:15
 */
@Service()
public class StudentServerimpl implements StudentServer {

    @Resource
    public StudentDao studentDao;

    @Override
    public int addStudent(Student student){
        return studentDao.addStudent(student);
    }

    @Override
    public List<Student> queryStudent(){
        return studentDao.queryStudent();
    }

    @Override
    public void deleteStudent(Integer id){
        studentDao.deleteStudent(id);
    }

    @Override
    public Student modifyStudent(Integer id){
        return studentDao.modifyStudent(id);
    }

    @Override
    public void updateStudent(Student student){
        studentDao.updateStudent(student);
    }

    @Override
    public List<Student> findStudent(Integer id){
        return studentDao.findStudent(id);
    }

}
