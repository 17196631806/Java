<%--
  Created by IntelliJ IDEA.
  User: mhome
  Date: 2018/9/4
  Time: 下午1:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>登录</title>
    <link rel="stylesheet" href="css/pintuer.css" type="text/css" charset="UTF-8">
    <script src="js/jquery.js"></script>
    <script src="js/login.js"></script>
</head>
<body>
<div class="bg"></div>
<div class="container">
    <div class="line bouncein">
        <div class="xs6 xm4 xs3-move xm4-move">
            <div style="height: 150px;"></div>
            <div class="media media-y margin-big-bottom"></div>
            <form action="/login" method="post">
                <div class="panel loginbox">
                    <div class="text-center margin-big padding-big-top">
                        <h1>后台管理中心</h1>
                    </div>
                    <div class="panel-body"
                         style="padding: 30px; padding-bottom: 10px; padding-top: 10px;">
                        <div class="form-group">
                            <div class="field field-icon-right">
                                <input type="text" class="input input-big" name="username"
                                       placeholder="登录账号" data-validate="required:请填写账号" /> <span
                                    class="icon icon-user margin-small-top"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="field field-icon-right">
                                <input type="password" class="input input-big"
                                       name="password" placeholder="登录密码"
                                       data-validate="required:请填写密码" /> <span
                                    class="icon icon-key margin-small-top"></span>
                            </div>
                        </div>
                    </div>
                    <%-- ${error } --%>
                    <%--<s:property value="#request.error"/>--%>
                    <%--<s:--%>
                    <div style="padding: 30px;">
                        <input type="submit"
                               class="button button-block bg-main text-big input-big"
                               value="登录">
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
