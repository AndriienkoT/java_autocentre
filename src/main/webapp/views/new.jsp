<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 27/05/2016
  Time: 20:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>New car</title>
</head>
<body>
<h2>Input data:</h2>
    <form action="/createNewCar" method="post">
        Model <input type="text" name="model">
        Equipment <input type="text" name="equipment">
        Engine volume <input type="text" name="engine_volume">
        Engine type <input type="text" name="engine_type">
        Year of issue <input type="text" name="year_of_issue">
        Mileage <input type="text" name="mileage">
        Price <input type="text" name="price">
        <button type="submit">Submit</button>
    </form>
</body>
</html>

