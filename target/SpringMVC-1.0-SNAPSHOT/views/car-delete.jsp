<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 05/06/2016
  Time: 18:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Delete car</title>
</head>
<body>
    <h4>Input data:</h4>
    <form action="/deleteCarById" method="post">
        Id <input type="text" name="id">
        <button type="submit">Delete</button>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    </form>
</body>
</html>
