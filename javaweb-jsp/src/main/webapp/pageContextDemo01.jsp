<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/8/11
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    pageContext.setAttribute("name1","啦啦啦1");//保存的数据只在一个页面中有效
    request.setAttribute("name2","啦啦啦2");//保存的数据旨在一次请求中有效，请求转发会携带这个数据
    session.setAttribute("name3","啦啦啦3");//保存的数据只在一次会话中存放，从打开浏览器到关闭浏览器
    application.setAttribute("name4","啦啦啦4");//保存的数据只在服务器中有效，从打开服务器到关闭服务器
%>
<%
    //从pageContext取出
    //从底层到高层(作用域) page->request->session->application
    //JVM:双亲委派机制 往上寻找，向下使用
    String name1 = (String)pageContext.findAttribute("name1");
    String name2 = (String)pageContext.findAttribute("name2");
    String name3 = (String)pageContext.findAttribute("name3");
    String name4 = (String)pageContext.findAttribute("name4");

%>
<br>
name1 : ${name1} <br>
name2 : ${name2} <br>
name3 : ${name3} <br>
name4 : ${name4} <br>

</body>
</html>
