<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 27/05/2016
  Time: 19:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>

    <!-- Таблица стилей CSS -->
    <style type="text/css">
        .item{
            background: lightgray;
            height: 500px !important;
        }
        .carousel{
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <blockquote class="pull-right">
        <p><em>Be free - buy AUDI</em></p>
    </blockquote>


    <!-- Карусель -->
    <div id="myCarousel" class="carousel slide" data-interval="5000" data-ride="carousel">
        <!-- Индикаторы для карусели -->
        <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
            <li data-target="#myCarousel" data-slide-to="1"></li>
            <li data-target="#myCarousel" data-slide-to="2"></li>
        </ol>
        <!-- Слайды карусели -->
        <div class="carousel-inner">
            <div class="active item">
                <div class="carousel-caption">
                    <img src="/resources/images/4.jpg" class="col-xs-12">
                </div>
            </div>
            <div class="item">
                <div class="carousel-caption">
                    <img src="/resources/images/6.jpg" class="col-xs-12">
                </div>
            </div>
            <div class="item">
                <div class="carousel-caption">
                    <img src="/resources/images/5.jpg" class="col-xs-12">
                </div>
            </div>
        </div>
        <!-- Навигация для карусели -->
        <!-- Кнопка, осуществляющая переход на предыдущий слайд с помощью атрибута data-slide="prev" -->
        <a class="carousel-control left" href="#myCarousel" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left"></span>
        </a>
        <!-- Кнопка, осуществляющая переход на следующий слайд с помощью атрибута data-slide="next" -->
        <a class="carousel-control right" href="#myCarousel" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right"></span>
        </a>
    </div>


    <h4 class="text-center">Contacts</h4>
    <ul class="nav nav-tabs">
        <li class="active"><a data-toggle="tab" href="#phone">Phone</a></li>
        <li><a data-toggle="tab" href="#email">Email</a></li>
        <li><a data-toggle="tab" href="#address">Address</a></li>
    </ul>
    <div class="tab-content">
        <div id="phone" class="tab-pane fade in active">
            <h5>+380320000000</h5>
        </div>
        <div id="email" class="tab-pane fade">
            <h5>audi-soul@gmail.com</h5>
        </div>
        <div id="address" class="tab-pane fade">
            <h5>Lviv</h5>
        </div>
    </div>

    <div><h1 class="space">just space</h1></div>
</body>
</html>
