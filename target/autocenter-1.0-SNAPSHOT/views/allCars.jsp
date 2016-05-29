<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 27/05/2016
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>All cars</title>
</head>
<body>
    <h2>All Cars</h2>
    <table>
        <thead>
            <tr>
                <th>Car model</th>
                <th>Car equipment</th>
                <th>Car engine volume</th>
                <th>Car engine type</th>
                <th>Car year of issue</th>
                <th>Car mileage</th>
                <th>Car price</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${cars}" var="a">
                <tr>
                    <td>${a.model}</td>
                    <td>${a.equipment}</td>
                    <td>${a.engine_volume}</td>
                    <td>${a.engine_type}</td>
                    <td>${a.year_of_issue}</td>
                    <td>${a.mileage}</td>
                    <td>${a.price}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="/newCar">Create new car</a>
</body>
</html>
