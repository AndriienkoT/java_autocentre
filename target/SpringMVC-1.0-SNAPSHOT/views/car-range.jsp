<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 04/06/2016
  Time: 18:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Car range</title>
</head>
<body>
    <div><a href=/showAllCars>All cars</a></div>
    <div><sec:authorize access="hasRole('ROLE_ADMIN')"><a href="/newCar">Create new car</a></sec:authorize></div>
    <div><a href=/findByModel>Find car by model</a></div>
    <div><a href=/findByEngineVolume>Find car by engine volume</a></div>
    <div><a href=/findByYearOfIssue>Find car by year of issue</a></div>
    <div><sec:authorize access="hasRole('ROLE_ADMIN')"><a href="/deleteCar">Delete car</a></sec:authorize></div>
</body>
</html>
