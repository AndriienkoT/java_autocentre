<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 07/06/2016
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>New part or accessory</title>
</head>
<body>
<h4>Input data:</h4>
    <form action="/createNewPartsAndAccessories" method="post" >
        Name <input type="text" name="name">
        Amount <input type="text" name="amount">
        Price <input type="text" name="price">
        <button type="submit">Create</button>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    </form>

</body>
</html>
