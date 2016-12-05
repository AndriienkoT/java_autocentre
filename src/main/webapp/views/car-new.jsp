<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 04/06/2016
  Time: 19:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>New car</title>
</head>
<body>
    <form class="form-horizontal" action="/createNewCar" method="post" role="form" enctype="multipart/form-data">
        <div  class="form-group">
            <label for="inputModel" class="col-sm-2 control-label"></label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputModel" placeholder="Model" name="model">
            </div>
        </div>
        <div  class="form-group">
            <label for="inputEquipment" class="col-sm-2 control-label"></label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputEquipment" placeholder="Equipment" name="equipment">
            </div>
        </div>
        <div  class="form-group">
            <label for="inputEngineVolume" class="col-sm-2 control-label"></label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputEngineVolume" placeholder="Engine volume" name="engine_volume">
            </div>
        </div>
        <div  class="form-group">
            <label for="inputEngineType" class="col-sm-2 control-label"></label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputEngineType" placeholder="Engine type" name="engine_type">
            </div>
        </div>
        <div  class="form-group">
            <label for="inputYearOfIssue" class="col-sm-2 control-label"></label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputYearOfIssue" placeholder="Year of issue" name="year_of_issue">
            </div>
        </div>
        <div  class="form-group">
            <label for="inputMileage" class="col-sm-2 control-label"></label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputMileage" placeholder="Mileage" name="mileage">
            </div>
        </div>
        <div  class="form-group">
            <label for="inputPrice" class="col-sm-2 control-label"></label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputPrice" placeholder="Price" name="price">
            </div>
        </div>
        <div  class="form-group">
            <label for="inputPicture" class="col-sm-2 control-label"></label>
            <div class="col-sm-10">
                <input type="file" class="form-control" id="inputPicture" placeholder="Picture" name="image">
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