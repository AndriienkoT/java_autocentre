<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 07/06/2016
  Time: 13:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>All parts and accessories</title>
</head>
<body>
<h3>All parts and accessories</h3>
<table class="table table-hover table-bordered table-condensed">
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
