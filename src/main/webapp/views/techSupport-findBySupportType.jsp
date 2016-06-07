<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 07/06/2016
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Find support type</title>
</head>
<body>
<h4>Input data:</h4>
<form action="/findSupportByType" method="post">
    Support type <input type="text" name="support_type">
    <button type="submit">Find</button>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>

<table class="table table-hover">
    <thead>
    <tr>
        <th>Support type</th>
        <th>Price</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${techSupports}" var="a">
        <tr>
            <td>${a.support_type}</td>
            <td>${a.price}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
