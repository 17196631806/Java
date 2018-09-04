package com.dw.controller;

import com.dw.model.User;
import com.dw.service.impl.UserServerimpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
    private String uri;

    /**
     * 登录功能
     * @param user      登录用户的密码和账户
     * @param request
     * @param response
     */
    @RequestMapping("login")
    public void login(User user, HttpServletRequest request, HttpServletResponse response)throws Exception{
        response.setCharacterEncoding("utf-8");
        try {
            User loginInfo = userServerimpl.UserChek(user);
            if (loginInfo==null){
                uri = "login.jsp";
            }else {
                request.getSession().setAttribute("loginInfo",loginInfo);
                uri = "main.jsp";
            }
        }catch (Exception e){
            e.printStackTrace();
            uri = "error.jsp";
        }

        request.getRequestDispatcher("/WEB-INF/views/"+uri).forward(request,response);
    }

    /**
     * 退出功能
     * @param request
     * @param response
     * @throws Exception
     */
    @RequestMapping("exit")
    public String exit(HttpServletRequest request,HttpServletResponse response)throws Exception{
        HttpSession session = request.getSession(false);
        if (session != null){
            session.removeAttribute("loginInfo");
            session.invalidate();
        }
        return "login";
    }


    /**
     *修改用户密码界面
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping("modifyPwdUI")
    public String modifyPwdUI(HttpServletRequest request,HttpServletResponse response)throws  Exception {
        return "modifyPwd";
    }

    /**
     * 提交修改密码操作
     * @param user
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping("modfiyPwd")
    public String modifyPwd(User user, HttpServletRequest request, HttpServletResponse response)throws  Exception{
        String id = user.getPassword();
        userServerimpl.modifyPassword(user.getId());
        return "main";
    }
}
