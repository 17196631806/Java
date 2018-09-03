package com.dw.controller;

import com.dw.model.User;
import com.dw.service.impl.UserServerimpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: StudentManagerWeb
 * @description: 用户登录的控制器
 * @author: liu yan
 * @create: 2018-08-29 14:01
 */
@Controller
public class UserLogin {

    @Resource
    public UserServerimpl userServerimpl;

    /**
     * 具有保持登录状态的登录功能
     * @param user      登录用户的密码和账户
     * @param request
     * @param response
     */
    @RequestMapping("login")
    public String login(User user, HttpServletRequest request, HttpServletResponse response)throws Exception{
        // 解决请求和响应乱码问题
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");
            String name = user.getUsername();
            String password = user.getPassword();
            User user1 = userServerimpl.UserChek(user);
            System.out.println(user1);
            if (user1!=null){
                //转发，将数据传给界面进行展示
                return "main";
//                request.getRequestDispatcher("/WEB-INF/views/main.jsp").forward(request,response);
//                response.sendRedirect("/main.jsp");
            }else {
                return "index";
            }
    }

}
