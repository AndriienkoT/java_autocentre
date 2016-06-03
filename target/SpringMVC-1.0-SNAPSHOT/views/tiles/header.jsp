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
    <link rel="stylesheet" href="./css/style.css">
</head>
<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="50">
    <sec:authorize access="isAnonymous()"> <a href="/login">Login</a></sec:authorize>
    <sec:authorize access="isAuthenticated()"> Hello, <sec:authentication property="name" /> <a href="/logout">Logout</a></sec:authorize>


    <nav class="navbar navbar-default navbar-fixed-top">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
            </div>
            <div class="collapse navbar-collapse" id="myNavbar">
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="/home">Home</a></li>
                    <li><a href="/carRange">Car range</a></li>
                    <li><a href="/financing">Financing</a></li>
                    <li><a href="/order">Order</a></li>
                    <li><a href="/partsAndAccessories">Parts and accessories</a></li>
                    <li><a href="/techSupport">Technical support</a></li>
                </ul>
            </div>
        </div>
    </nav>
</body>
</html>
