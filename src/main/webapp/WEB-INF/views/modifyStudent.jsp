<%--
  Created by IntelliJ IDEA.
  User: mhome
  Date: 2018/8/31
  Time: 下午1:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="/css/addFrom.css" type="text/css" charset="utf-8">
<html>
<head>
    <title>修改学生信息</title>
    <script type="text/javascript">
        function checkInput() {
            var name = document.form1.name1.value;
            var age = document.form1.age.value;
            var a =isNaN(age);
            if(name == "") {
                alert("请输入姓名!");
                return false;
            } else if(age == "") {
                alert("请输入年龄!");
                return false;
            } else if(a){
                alert("年龄有误!");
                return false;
            }else{
                return true;
            }
        }
    </script>
</head>
<body>
<div class="divStyle">
    <form action="/updateStudent?id=${student.id}" method="post">
        <span class="titleNameStyle">姓名:</span>&nbsp
        <input type="text" class="nameStyle" name="name" value="${student.name}">

        <span class="titleSexStyle">性别:</span><span class="titleSexStyle1">男</span>
        <input  class="sexManStyle" type="radio" name="sex" value="0" ${student.sex == '0' ? "checked" : " "}>
        <span class="titleSexStyle2">女</span>
        <input class="sexWomanStyle" type="radio" name="sex" value="1" ${student.sex == '1' ? "checked" : " "}>

        <span class="titleAgeStyle">年龄:</span>&nbsp
        <input  class="ageStyle" type="text" class="nameStyle" name="age" value="${student.age}">

        <span class="titleTelStyle">电话:</span>&nbsp
        <input  class="telStyle" type="text" class="nameStyle" name="tel" value="${student.tel}">

        <span class="titleDeptStyle">系别:</span>&nbsp
        <input  class="deptStyle" type="text" class="nameStyle" name="dept" value="${student.dept}">

        <span class="titleAddressStyle">地址:</span>&nbsp
        <input  class="addressStyle" type="text" class="nameStyle" name="address" value="${student.address}">

        <input class="addButton" type="submit" value="提交">
    </form>

</div>
</body>
</html>
