<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 05/06/2016
  Time: 18:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>All financing types</title>
</head>
<body>
<h3>All financing types</h3>
<table class="table table-hover table-bordered table-condensed">
    <thead>
    <tr>
        <th>Financing type</th>
        <th>Financing term</th>
        <th>Financing percent</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${financings}" var="a">
        <tr>
            <td>${a.type}</td>
            <td>${a.term}</td>
            <td>${a.percent}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
