<%--
  Created by IntelliJ IDEA.
  User: super
  Date: 2020/7/21
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container clearfix">
    <div>
        <a href="${pageContext.request.contextPath}/user/toLogin" class="btn btn-lg">登录</a>

    </div>
    <div>
        <a href="${pageContext.request.contextPath}/user/toAllBook" class="btn btn-lg">主页</a>
    </div>
    <div>
        <a href="${pageContext.request.contextPath}/toRegister" class="btn btn-lg">注册</a>
    </div>
</div>
</body>
</html>
