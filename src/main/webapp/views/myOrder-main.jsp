<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 06/06/2016
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Order</title>
</head>
<body>
    <div><a href=/showAllOrders>All order</a></div>
    <div><sec:authorize access="hasRole('ROLE_ADMIN')"><a href="/newOrder">Create new order</a></sec:authorize></div>
    <div><a href=/findByCustomer>Find order by customer</a></div>
    <div><a href=/findByOrderDate>Find order by order date</a></div>
    <div><a href=/findByAuto>Find order by auto</a></div>
    <div><a href=/findByFinType>Find order by financing type</a></div>
    <div><sec:authorize access="hasRole('ROLE_ADMIN')"><a href="/deleteOrder">Delete order</a></sec:authorize></div>
</body>
</html>
