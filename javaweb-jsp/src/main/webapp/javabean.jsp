<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/8/11
  Time: 20:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<jsp:useBean id="people" class="com.daisy.pojo.People" scope="page"/>
<jsp:setProperty name="people" property="address" value="山东"/>
<jsp:setProperty name="people" property="id" value="1" />
<jsp:setProperty name="people" property="age" value="20" />
<jsp:setProperty name="people" property="name" value="阿幡" />

id : <jsp:getProperty name="people" property="id"/>
<br>
name : <jsp:getProperty name="people" property="name"/>
<br>
age : <jsp:getProperty name="people" property="age"/>
<br>
address : <jsp:getProperty name="people" property="address"/>
</body>
</html>
