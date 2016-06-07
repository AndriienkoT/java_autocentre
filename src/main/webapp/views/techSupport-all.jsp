<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 07/06/2016
  Time: 14:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>All technical support</title>
</head>
<body>
<h3>All technical support</h3>
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
