<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/8/11
  Time: 19:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>测试</h4>
<hr>
<form action="core.jsp" method="get">
    <input type="text" name="username" value="${param.username}">
    <input type="submit" value="登录">
</form>
<c:if test="${param.username == 'admin'}" var="isAdmin">
    <h2>登录成功</h2>
    <c:out value="管理员欢迎您"></c:out>
</c:if>

<c:choose>
    <c:when test=""></c:when>
</c:choose>

<c:out value="${isAdmin}"></c:out>

<%
    ArrayList<String> people = new ArrayList<>();
    people.add("张三");
    people.add("李四");
    people.add("王五");
    people.add("test");
    people.add("daisy");

    request.setAttribute("list", people);
%>
<br>
<hr>
<%--
    var:每一次遍历出来的变量
    items:要遍历的对象
    begin:
    end:
    step:步长
--%>
<c:forEach var="people" items="${list}">
    <c:out value="${people}" ></c:out> <br>
</c:forEach>


<hr>
<br>
<c:forEach items="${list}" var="people" begin="0" step="2">
    <c:out value="${people}"></c:out> <br>
</c:forEach>
</body>
</html>
