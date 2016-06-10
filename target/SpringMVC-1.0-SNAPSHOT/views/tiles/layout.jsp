<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 27/05/2016
  Time: 19:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title><tiles:getAsString name="title"/></title>
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css" />
    <link rel="stylesheet" href="/resources/css/bootstrap-theme.min.css" />
    <script src="/resources/jquery/jquery-2.2.4.min.js"></script>
    <script src="/resources/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="/resources/css/style.css" />
</head>
<body>
    <div class="headerClass">
        <tiles:insertAttribute name="header"/>
    </div>
    <div class="bodyClass">
        <tiles:insertAttribute name="body"/>
    </div>
    <div>
        <tiles:insertAttribute name="footer"/>
    </div>
</body>
</html>
