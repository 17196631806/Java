package com.dw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: StudentManagerWeb
 * @description: jsp之间的跳转
 * @author: liu yan
 * @create: 2018-08-30 16:56
 */
@Controller
public class JspToJsp {

    @RequestMapping("addStudentJsp")
    public String addStudent(HttpServletResponse response, HttpServletRequest request) throws Exception{
        return "addStudent";
    }

}
