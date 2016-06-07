
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
    <form:form method="post" action="/createNewUser" modelAttribute="user">
        <form:label path="name">Name:</form:label>
        <form:input path="name"/>
        <form:label path="surname">Surname:</form:label>
        <form:input path="surname"/>
        <form:label path="email">Email:</form:label>
        <form:input path="email"/>
        <form:label path="phone">Phone:</form:label>
        <form:input path="phone"/>
        <form:label path="password">Password:</form:label>
        <form:password path="password"/>
        <form:button>Registrate</form:button>
    </form:form>
</body>
</html>
