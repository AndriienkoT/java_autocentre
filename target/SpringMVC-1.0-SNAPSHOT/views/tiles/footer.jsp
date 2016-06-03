<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 27/05/2016
  Time: 19:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    <?php
        date_default_timezone_set("Europe/Kiev");
        echo "Час покупки: ".date("H:i")."<br>";
    ?>
    © 01.01.2015-<?php echo date ("d.m.Y"); echo "<br>" ?>
</body>
</html>
