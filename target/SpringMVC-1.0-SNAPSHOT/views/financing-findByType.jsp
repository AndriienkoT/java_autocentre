<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 05/06/2016
  Time: 18:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Find financing conditions by type</title>
</head>
<body>
<h2>Input data:</h2>
    <form action="/findFinancingByType" method="post">
        Financing type <input type="text" name="type">
        <button type="submit">Find</button>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    </form>

<table class="table table-hover">
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
