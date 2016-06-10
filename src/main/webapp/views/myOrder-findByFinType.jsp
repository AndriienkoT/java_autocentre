<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 06/06/2016
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Find order by financing type</title>
</head>
<body>
    <form class="form-horizontal" action="/findOrderByFinType" method="post" role="form">
        <div class="form-group">
            <label class="col-sm-2 control-label"></label>
            <div class="col-sm-10">
                <input type="text" class="form-control" placeholder="Financing type" name="fin_type">
            </div>
        </div>
        <div  class="form-group">
            <div class="col-sm-1 col-sm-10">
                <button type="submit" class="btn btn-default">Find</button>
            </div>
        </div>
    </form>

    <table class="table table-hover table-bordered table-condensed">
        <thead>
        <tr>
            <th>Order date</th>
            <th>Customer</th>
            <th>Auto</th>
            <th>Price</th>
            <th>Financing type</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${orders}" var="a">
            <tr>
                <td>${a.order_date}</td>
                <td>${a.customer}</td>
                <td>${a.auto}</td>
                <td>${a.price}</td>
                <td>${a.fin_type}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>
