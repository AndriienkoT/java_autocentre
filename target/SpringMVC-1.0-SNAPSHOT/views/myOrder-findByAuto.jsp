<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 06/06/2016
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Find order by auto</title>
</head>
<body>
    <h4>Input data:</h4>
    <form action="/findOrderByAuto" method="post">
        Auto <input type="text" name="auto">
        <button type="submit">Find</button>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    </form>

    <table class="table table-hover">
        <thead>
        <tr>
            <th>Order date</th>
            <th>Customer</th>
            <th>Auto</th>
            <th>Price</th>
            <th>Financing type</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${orders}" var="a">
            <tr>
                <td>${a.order_date}</td>
                <td>${a.customer}</td>
                <td>${a.auto}</td>
                <td>${a.price}</td>
                <td>${a.fin_type}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>
