<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 05/06/2016
  Time: 18:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Find financing conditions by type</title>
</head>
<body>
    <form class="form-horizontal" action="/findFinancingByType" method="post" role="form">
        <div class="form-group">
            <label class="col-sm-2 control-label"></label>
            <div class="col-sm-10">
                <input type="text" class="form-control" placeholder="Financing type" name="type">
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
            <th>Financing type</th>
            <th>Financing term</th>
            <th>Financing percent</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach items="${financings}" var="a">
                <tr>
                    <td>${a.type}</td>
                    <td>${a.term}</td>
                    <td>${a.percent}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
