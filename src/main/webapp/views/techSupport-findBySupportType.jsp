<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 07/06/2016
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Find support type</title>
</head>
<body>
    <form class="form-horizontal" action="/findSupportByType" method="post" role="form">
        <div class="form-group">
            <label class="col-sm-2 control-label"></label>
            <div class="col-sm-10">
                <input type="text" class="form-control" placeholder="Support type" name="support_type">
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
            <th>Support type</th>
            <th>Price</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${techSupports}" var="a">
            <tr>
                <td>${a.support_type}</td>
                <td>${a.price}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>
