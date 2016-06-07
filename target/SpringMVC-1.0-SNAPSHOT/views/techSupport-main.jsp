<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 07/06/2016
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Technical support</title>
</head>
<body>
    <div><a href=/showAllTechSupport>All technical support</a></div>
    <div><sec:authorize access="hasRole('ROLE_ADMIN')"><a href="/newTechSupport">Create new technical support</a></sec:authorize></div>
    <div><a href=/findBySupportType>Find support type</a></div>
    <div><sec:authorize access="hasRole('ROLE_ADMIN')"><a href="/deleteTechSupport">Delete technical support</a></sec:authorize></div>
</body>
</html>
