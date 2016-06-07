<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 06/06/2016
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>New order</title>
</head>
<body>
    <h4>Input data:</h4>
    <form action="/createNewOrder" method="post" >
        Customer <input type="text" name="customer">
        Auto <input type="text" name="auto">
        Price <input type="text" name="price">
        Financing type <input type="text" name="fin_type">
        <button type="submit">Create</button>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    </form>

</body>
</html>
