
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <form class="form-horizontal" action="/loginprocessing" method="post" role="form">
        <div class="form-group">
            <label class="col-sm-2 control-label"></label>
            <div class="col-sm-10">
                <input type="text" class="form-control" placeholder="Email or phone" name="username">
            </div>
        </div>
        <div  class="form-group">
            <label class="col-sm-2 control-label"></label>
            <div class="col-sm-10">
                <input type="password" class="form-control"  placeholder="Password" name="password">
            </div>
        </div>
        <div  class="form-group">
            <div class="col-sm-1 col-sm-10">
                <button type="submit" class="btn btn-default">Submit</button>
            </div>
        </div>
    </form>
</body>
</html>
