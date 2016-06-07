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
    <a href="#">Logo                               </a>

    <div class="btn-group">
        <a href="/home" class="btn btn-default active" role="button">Home</a>
        <a href="/car-range" class="btn btn-default active" role="button">Financing</a>
        <a href="/financing-main" class="btn btn-default active" role="button">Car range</a>
        <a href="/myOrder-main" class="btn btn-default active" role="button">Order</a>
        <a href="/partsAndAccessories-main" class="btn btn-default active" role="button">Parts and accessories</a>
        <a href="/techSupport-main" class="btn btn-default active" role="button">Technical support</a>
    </div>

    <sec:authorize access="isAnonymous()"> <a  class="btn btn-primary" href="/loginpage">Login</a></sec:authorize>
    <sec:authorize access="isAuthenticated()"> Hello, <a href="/myCabinet=${loginedUser.id}">${loginedUser.name}</a> <a  class="btn btn-primary" href="/logout">Logout</a></sec:authorize>
    <a class="btn btn-primary" href="/registration">Registration</a>

</body>
</html>
