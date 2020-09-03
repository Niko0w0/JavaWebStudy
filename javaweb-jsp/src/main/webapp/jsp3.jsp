<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/8/11
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--将两个页面合二为一--%>
<%@include file="common/head.jsp" %>
<h5>网页主体</h5>
<%@include file="common/footer.jsp" %>

<hr>
<%--jsp:include 拼接页面，本质还是三个--%>
<jsp:include page="common/head.jsp"/>
<jsp:include page="common/footer.jsp" />
</body>
</html>
