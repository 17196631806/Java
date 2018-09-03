<%--
  Created by IntelliJ IDEA.
  User: mhome
  Date: 2018/9/3
  Time: 下午4:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .divStyle{
            border-style: solid;
            width: 550px;
            height: 260px;
            position: absolute;
            right: 650px;
            bottom: 300px;
        }
        .nameStyle{
            width: 240px;
            height: 30px;
            position: absolute;
            top: 40px;
            left: 140px;

        }
        .titleStyle{
            width: 90px;
            height: 30px;
            position: absolute;
            top: 45px;
            left: 40px;
        }
        .addButton {
            width: 90px;
            height: 35px;
            background-color: blue;
            position: absolute;
            top: 210px;
            left: 120px;
        }
        .resetButton {
            width: 90px;
            height: 35px;
            background-color: green;
            position: absolute;
            top: 210px;
            left: 240px;
        }
        #title{
            width: 140px;
            height: 30px;
            position: absolute;
            top: 30px;
            left: 60px;
        }
    </style>
</head>
<body>
<div class="divStyle">
    <form action="/modfiyPwd" method="post">
        <span id="title" style="font-size: 30px">修改密码</span>
        <span class="titleStyle" style="top: 110px;">新密码:</span>&nbsp<input  class="nameStyle" type="text" class="nameStyle" name="age" style="top: 105px;">
        <span class="titleStyle" style="top: 150px;">确定新密码:</span>&nbsp<input  class="nameStyle" type="text" class="nameStyle" name="tel" style="top: 145px;">
        <input class="addButton" type="submit" value="添加">
        <input class="resetButton" type="reset" value="重置">
    </form>

</div>


</body>
</html>
