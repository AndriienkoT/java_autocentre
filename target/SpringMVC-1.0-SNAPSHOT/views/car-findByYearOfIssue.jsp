<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 05/06/2016
  Time: 18:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Find car by year of issue</title>
</head>
<body>
    <form class="form-horizontal" action="/findCarByYearOfIssue" method="post" role="form">
        <div class="form-group">
            <label class="col-sm-2 control-label"></label>
            <div class="col-sm-10">
                <input type="text" class="form-control" placeholder="Year of issue" name="year_of_issue">
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
            <th>Car model</th>
            <th>Car equipment</th>
            <th>Car engine volume</th>
            <th>Car engine type</th>
            <th>Car year of issue</th>
            <th>Car mileage</th>
            <th>Car price</th>
            <th>Picture</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${cars}" var="a">
            <tr>
                <td>${a.model}</td>
                <td>${a.equipment}</td>
                <td>${a.engine_volume}</td>
                <td>${a.engine_type}</td>
                <td>${a.year_of_issue}</td>
                <td>${a.mileage}</td>
                <td>${a.price}</td>
                    <%--<td><img src="data:images/cars/jpeg;base64,${a.avatar}"/></td>--%>
                <td><img src="<c:url value="../resources/images/cars/${a.id}.jpg"></c:url>"  class="img-polaroid"></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>
