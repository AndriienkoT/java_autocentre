
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<div class="container">
    <form class="form-horizontal" action="/loginprocessing" method="post">
        <div class="form-group">
            Email or phone: <input class="form-control" id="inputEmail3" type="text" name="username">
        </div>
        <div  class="form-group">
            Password <input class="form-control" id="inputEmail3" type="password" name="password">
        </div>
        <div  class="form-group">
            <button type="submit"><span class="glyphicon glyphicon-log-in"></span> Submit</button>
        </div>
    </form>
</div>
</body>
</html>
