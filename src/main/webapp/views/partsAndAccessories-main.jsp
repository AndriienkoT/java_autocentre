<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 07/06/2016
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Parts or accessories</title>
</head>
<body>
    <div><a href=/showAllPartsAndAccessories>All parts and accessories</a></div>
    <div><sec:authorize access="hasRole('ROLE_ADMIN')"><a href="/newPartsAndAccessories">Create new part or accessory</a></sec:authorize></div>
    <div><a href=/findByName>Find parts and accessories by name</a></div>
    <div><sec:authorize access="hasRole('ROLE_ADMIN')"><a href="/deletePartsAndAccessories">Delete part or accessory</a></sec:authorize></div>
</body>
</html>
