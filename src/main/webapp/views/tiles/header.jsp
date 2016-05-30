<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 27/05/2016
  Time: 19:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <sec:authorize access="isAnonymous()"> <a href="/login">Login</a></sec:authorize>
    <sec:authorize access="isAuthenticated()"> Hello, <sec:authentication property="name" /> <a href="/logout">Logout</a></sec:authorize>

    <h1>HEADER</h1>
</body>
</html>
