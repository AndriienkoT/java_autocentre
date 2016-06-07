<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 07/06/2016
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Find parts and accessories by name</title>
</head>
<body>
<h4>Input data:</h4>
<form action="/findPartsByName" method="post">
    Name <input type="text" name="name">
    <button type="submit">Find</button>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>

<table class="table table-hover">
    <thead>
    <tr>
        <th>Name</th>
        <th>Amount</th>
        <th>Price</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${partsAndAccessoriess}" var="a">
        <tr>
            <td>${a.name}</td>
            <td>${a.amount}</td>
            <td>${a.price}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
