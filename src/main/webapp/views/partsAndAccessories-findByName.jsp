<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 07/06/2016
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Find parts and accessories by name</title>
</head>
<body>
    <form class="form-horizontal" action="/findPartsByName" method="post" role="form">
        <div class="form-group">
            <label class="col-sm-2 control-label"></label>
            <div class="col-sm-10">
                <input type="text" class="form-control" placeholder="Name" name="name">
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
            <th>Name</th>
            <th>Amount</th>
            <th>Price</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${partsAndAccessoriess}" var="a">
            <tr>
                <td>${a.name}</td>
                <td>${a.amount}</td>
                <td>${a.price}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>
