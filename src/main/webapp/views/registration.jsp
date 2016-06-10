
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
    <form class="form-horizontal" action="/createNewUser" method="post" role="form" modelAttribute="user">
        <div class="form-group">
            <label for="inputName3" class="col-sm-2 control-label"></label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputName3" placeholder="Name" name="name">
            </div>
        </div>
        <div  class="form-group">
            <label for="inputSurname3" class="col-sm-2 control-label"></label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputSurname3" placeholder="Surname" name="surname">
            </div>
        </div>
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label"></label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputEmail3" placeholder="Email" name="email">
            </div>
        </div>
        <div class="form-group">
            <label for="inputPhone3" class="col-sm-2 control-label"></label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputPhone3" placeholder="Phone" name="phone">
            </div>
        </div>
        <div  class="form-group">
            <label for="inputPassword3" class="col-sm-2 control-label"></label>
            <div class="col-sm-10">
                <input type="password" class="form-control" id="inputPassword3" placeholder="Password" name="password">
            </div>
        </div>
        <div  class="form-group">
            <div class="col-sm-1 col-sm-10">
                <button type="submit" class="btn btn-default">Registrate</button>
            </div>
        </div>
    </form>
</body>
</html>
