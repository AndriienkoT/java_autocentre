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
    <link rel="stylesheet" href=<c:url value="/resources/css/bootstrap.min.css"></c:url>>
    <link rel="stylesheet" href=<c:url value="/resources/css/bootstrap-theme.min.css"></c:url>>
    <link rel="stylesheet" href=<c:url value="/resources/css/style.css"></c:url>/>
</head>
<body>
<div class="headerClass">
    <tiles:insertAttribute name="header"/>
</div>
<div class="bodyClass">
    <tiles:insertAttribute name="body"/>
</div>
<div class="footerClass">
    <tiles:insertAttribute name="footer"/>
</div>
</body>
</html>
