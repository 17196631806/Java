<%--
  Created by IntelliJ IDEA.
  User: mhome
  Date: 2018/8/30
  Time: 下午3:41
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
            height: 400px;
            position: absolute;
            right: 650px;
            bottom: 200px;
        }
        .nameStyle{
            width: 200px;
            height: 30px;
            position: absolute;
            top: 40px;
            left: 120px;

        }
        .titleStyle{
            width: 40px;
            height: 30px;
            position: absolute;
            top: 45px;
            left: 60px;
        }
        .addButton {
            width: 90px;
            height: 35px;
            background-color: blue;
            position: absolute;
            top: 350px;
            left: 120px;
        }
        .resetButton {
            width: 90px;
            height: 35px;
            background-color: green;
            position: absolute;
            top: 350px;
            left: 240px;
        }
    </style>
</head>
<body>
<div class="divStyle">
    <form action="/addStudent" method="post">
        <span class="titleStyle">姓名:</span>&nbsp<input type="text" class="nameStyle" name="name">
        <span class="titleStyle" style="top: 90px;">性别:</span><span class="titleStyle" style="top: 90px; left: 120px;">男</span><input  class="nameStyle" type="radio" name="sex" value="0" style="top: 85px;left: 140px">
        <span class="titleStyle" style="top: 90px; left: 170px;">女</span><input class="nameStyle" type="radio" name="sex" value="1" checked style="top: 85px;left: 190px">
        <span class="titleStyle" style="top: 140px;">年龄:</span>&nbsp<input  class="nameStyle" type="text" class="nameStyle" name="age" style="top: 135px;">
        <span class="titleStyle" style="top: 190px;">电话:</span>&nbsp<input  class="nameStyle" type="text" class="nameStyle" name="tel" style="top: 185px;">
        <span class="titleStyle" style="top: 240px;">系别:</span>&nbsp<input  class="nameStyle" type="text" class="nameStyle" name="dept" style="top: 235px;">
        <span class="titleStyle" style="top: 290px;">地址:</span>&nbsp<input  class="nameStyle" type="text" class="nameStyle" name="address" style="top: 285px;">
        <input class="addButton" type="submit" value="添加">
        <input class="resetButton" type="reset" value="重置">
    </form>

</div>


</body>
</html>
