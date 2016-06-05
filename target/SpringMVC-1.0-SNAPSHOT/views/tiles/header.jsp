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
    <title></title>
</head>
<body>
    <sec:authorize access="isAnonymous()"> <a href="/login">Login</a></sec:authorize>
    <sec:authorize access="isAuthenticated()"> Hello, <sec:authentication property="name" /> <a href="/logout">Logout</a></sec:authorize>

    <div><a href="/home">Home</a></div>
    <div><a href="/car-range">Car range</a></div>
    <div><a href="/financing-main">Financing</a></div>
    <div><a href="/order">Order</a></div>
    <div><a href="/partsAndAccessories">Parts and accessories</a></div>
    <div><a href="/techSupport">Technical support</a></div>
</body>
</html>
