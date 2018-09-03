package com.dw.controller;

import com.dw.model.Student;
import com.dw.service.impl.StudentServerimpl;
import com.dw.util.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: StudentManagerWeb
 * @description: 对于学生数据的增删改查
 * @author: liu yan
 * @create: 2018-08-30 17:12
 */
@Controller
public class ManageStudent {

    @Resource
    public StudentServerimpl studentServerimpl;


    /**
     * 添加学生信息的接口
     * @param student    封装的学生信息对象
     * @param request
     * @param response
     * @throws Exception
     */
    @RequestMapping("addStudent")
    public void addStudent(Student student, HttpServletRequest request, HttpServletResponse response)throws Exception{
        int sucess = studentServerimpl.addStudent(student);
        if (sucess > 0){
            request.getRequestDispatcher("/WEB-INF/views/main.jsp").forward(request,response);
        }
    }

    /**
     * 添加学生信息界面
     * @param response
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping("addStudentJsp")
    public String addStudent(HttpServletResponse response, HttpServletRequest request) throws Exception{
        return "addStudent";
    }

    @RequestMapping("queryStudent")
    public void  queryStudent(HttpServletRequest request,
                              HttpServletResponse response,
                              @RequestParam(defaultValue = "1") Integer pageIndex,
                              @RequestParam(defaultValue = "2") Integer pageSize) throws Exception{
        //获得所用用户信息
        List<Student> studentList = studentServerimpl.queryStudent();
        Page p = new Page();
        //设置每页条数
        p.setPageSize(pageSize);
        //设置页数
        p.setPageIndex(pageIndex);
        //总页数
        p.setPageTotalPages(studentList.size());
        //设置当前页
        if (studentList.size()%pageSize == 0){
            p.setPagePages(studentList.size()/pageSize);
        }else {
            p.setPagePages(studentList.size()/pageSize+1);
        }
        //获得分页数据在list集合中的索引
        int firstIndex = (pageIndex-1)*pageSize;
        int toIndex = pageIndex*pageSize;
        if (toIndex>studentList.size()){
            toIndex=studentList.size();
        }
        if (firstIndex>toIndex){
            firstIndex=0;
            p.setPageIndex(1);
        }
        //截取数据集合，获得分页数据
        List<Student> courseList = studentList.subList(firstIndex, toIndex);
        p.setEmpList(courseList);
        request.setAttribute("Page",p);
        System.out.println(studentList);
        request.getRequestDispatcher("/WEB-INF/views/studentList.jsp").forward(request,response);
    }


    /**
     * 修改操作
     * @param student
     * @param request
     * @param response
     * @throws Exception
     */
    @RequestMapping("updateStudent")
    public String modifyStudentDo(Student student,HttpServletRequest request,HttpServletResponse response)throws Exception{
        //跟新操作
        studentServerimpl.updateStudent(student);
        return "redirect:/queryStudent";

    }

    /**
     * 修改学生信息界面
     * @param student
     * @return
     * @throws Exception
     */
    @RequestMapping("modifyStudentUI")
    public void modifyStudentUI(Student student,HttpServletRequest request,HttpServletResponse response)throws Exception{
        Student studentInfor = studentServerimpl.modifyStudent(student.getId());
        request.setAttribute("student",studentInfor);
        request.getRequestDispatcher("/WEB-INF/views/modifyStudent.jsp").forward(request,response);
    }

    /**
     * 删除操作
     * @param student
     * @param response
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping("deletStudent")
    public String deletStudent(Student student, HttpServletResponse response,HttpServletRequest request)throws Exception{
        studentServerimpl.deleteStudent(student.getId());
        return "redirect:/queryStudent";
    }


    @RequestMapping("findStudent")
    public void findStudent(Student student,HttpServletRequest request,HttpServletResponse response,@RequestParam(defaultValue = "1") Integer pageIndex,
                            @RequestParam(defaultValue = "2") Integer pageSize)throws  Exception {
        List<Student> studentList = studentServerimpl.findStudent(student.getId());
        Page p = new Page();
//        //设置每页条数
        p.setPageSize(0);
        p.setEmpList(studentList);
        request.setAttribute("Page",p);
        System.out.println(studentList);
        request.getRequestDispatcher("/WEB-INF/views/studentList.jsp").forward(request,response);
    }


}
