<%--
  Created by IntelliJ IDEA.
  User: mhome
  Date: 2018/8/31
  Time: 上午10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="/css/list.css" type="text/css" charset="utf-8">
<html>
<head>
    <title>查询结果</title>
</head>
<body>
<div>
    <form action="/findStudent" method="post">
        <span class="no">学号:</span>&nbsp<input class="inputNo" type="text" name="id">
        <input class="btn" type="submit" value="查找">
    </form>
</div>
<div>
    <table class="gridtable">
        <tr>
            <th>学号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>年龄</th>
            <th>电话</th>
            <th>系别</th>
            <th>地址</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${Page.empList}" var="emp">
            <tr>
                <td>${emp.id}</td>
                <td>${emp.name}</td>
                <td>${emp.sex}</td>
                <td>${emp.age}</td>
                <td>${emp.tel}</td>
                <td>${emp.dept}</td>
                <td>${emp.address}</td>
                <td>
                    <a href="/modifyStudentUI?id=${emp.id}"><input type="button" id="modify" value="修改"/></a>
                    <a href="/deletStudent?id=${emp.id}"><input type="button" id="delete" value="删除"/></a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
<c:if test="${Page.pageSize != 0}">
    <div>
        <ul class="pagination">
            <li><a href="<c:url value="/queryStudent?pageIndex=1"/>">首页</a></li>
            <li><a href="<c:url value="/queryStudent?pageIndex=${Page.pageIndex-1>1?Page.pageIndex-1:1}"/>">&laquo;</a></li>
            <c:forEach begin="1" end="${Page.pagePages}" varStatus="loop">
                <c:set var="active" value="${loop.index==Page.pageIndex?'active':''}"/>
                <li><a class="${active}"
                       href="<c:url value="/queryStudent?pageIndex=${loop.index}"/>">${loop.index}</a>
                </li>
            </c:forEach>
            <li>
                <a href="<c:url value="/queryStudent?pageIndex=${Page.pageIndex+1<Page.pagePages?Page.pageIndex+1:Page.pagePages}"/>">&raquo;</a>
            </li>
            <li><a href="<c:url value="/queryStudent?pageIndex=${Page.pagePages}"/>">尾页</a></li>
        </ul>
    </div>
</c:if>


</body>
</html>
