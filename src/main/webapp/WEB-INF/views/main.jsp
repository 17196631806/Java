<%--
  Created by IntelliJ IDEA.
  User: mhome
  Date: 2018/8/29
  Time: 下午5:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/pintuer.css" type="text/css">
    <link rel="stylesheet" href="css/admin.css" type="text/css">
    <script src="js/jquery.js"></script>
</head>
<body>
<div class="header">
    <div class="logo margin-big-left fadein-top">
        <h1>
            <img src="images/y.jpg" class="radius-circle rotate-hover"
                 height="50" alt="" /> 后台管理中心
        </h1>
    </div>
</div>
<div class="line">
    <ul class="bread">
        <li><a href="" target="right" class="icon-home"> 首页</a></li>
        <li><a href="/addStudentJsp" target="right" class="icon-glass"> 添加学生信息</a></li>
        <li><a href="/queryStudent" target="right" class="icon-music"> 学生信息维护</a></li>
        <li><a href="/modifyPwdUI" target="right" class="icon-check"> 修改密码</a></li>
        <li><a href="/exit" target="right" class="icon-user"> 退出系统</a></li>
    </ul>
</div>
<div>
    <h1 style="margin-top: 100px;margin-left: 460px; color:red ">欢迎使用学生信息管理系统！</h1>
</div>

</body>
</html>
