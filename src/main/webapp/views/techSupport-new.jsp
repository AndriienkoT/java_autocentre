<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 07/06/2016
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>New technical support</title>
</head>
<body>
    <h4>Input data:</h4>
    <form action="/createNewTechSupport" method="post" >
        Support type <input type="text" name="support_type">
        Price <input type="text" name="price">
        <button type="submit">Create</button>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    </form>

</body>
</html>
