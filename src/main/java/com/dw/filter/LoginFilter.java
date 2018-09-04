package com.dw.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @program: StudentManagerWeb
 * @description:
 * @author: liu yan
 * @create: 2018-09-04 13:30
 */
public class LoginFilter implements Filter {

    private String uri;

    @Override
    public void doFilter(ServletRequest req, ServletResponse res,
                         FilterChain chain) throws IOException,ServletException {
        HttpServletResponse response = (HttpServletResponse)res;
        HttpServletRequest request = (HttpServletRequest)req;

        String uri = request.getRequestURI();
        String requestPath = uri.substring(uri.lastIndexOf("/")+1,uri.length());
        if ("login".equals(requestPath) || "login.jsp".equals(requestPath)){
            chain.doFilter(request,response);
        }else {
            HttpSession session = request.getSession(false);
            if (session != null){
                Object obj = session.getAttribute("loginInfo");
                if (obj != null){
                    chain.doFilter(request,response);
                    return;
                }else {
                    uri = "login.jsp";
                }
            }else {
                uri = "login.jsp";
            }
            request.getRequestDispatcher("/WEB-INF/views/"+uri).forward(request,response);
        }

    }

    @Override
    public void init(FilterConfig filterConfig) {

    }

    @Override
    public void destroy(){

    }
}