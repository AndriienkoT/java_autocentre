<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 07/06/2016
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>New part or accessory</title>
</head>
<body>
    <form class="form-horizontal" action="/createNewPartsAndAccessories" method="post" role="form">
        <div  class="form-group">
            <label for="inputName" class="col-sm-2 control-label"></label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputName" placeholder="Name" name="name">
            </div>
        </div>
        <div  class="form-group">
            <label for="inputAmount" class="col-sm-2 control-label"></label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputAmount" placeholder="Amount" name="amount">
            </div>
        </div>
        <div  class="form-group">
            <label for="inputPrice" class="col-sm-2 control-label"></label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputPrice" placeholder="Price" name="price">
            </div>
        </div>
        <div  class="form-group">
            <div class="col-sm-1 col-sm-10">
                <button type="submit" class="btn btn-default">Create</button>
            </div>
        </div>
    </form>
</body>
</html>
