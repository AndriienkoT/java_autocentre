<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 04/06/2016
  Time: 19:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>New car</title>
</head>
<body>
<h4>Input data:</h4>
    <form action="/createNewCar" method="post" >
        Model <input type="text" name="model">
        Equipment <input type="text" name="equipment">
        Engine volume <input type="text" name="engine_volume">
        Engine type <input type="text" name="engine_type">
        Year of issue <input type="text" name="year_of_issue">
        Mileage <input type="text" name="mileage">
        Price <input type="text" name="price">
        <button type="submit">Create</button>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    </form>

</body>
</html>
