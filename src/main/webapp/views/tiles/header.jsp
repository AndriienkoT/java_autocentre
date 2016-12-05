<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 27/05/2016
  Time: 19:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title></title>
</head>
<body>
    <div class="row">
        <div class="col-md-2">
            <span class="logo">AUDI-SOUL</span>
        </div>
        <div class="col-md-6">
            <div class="btn-group">
                <a href="/home" class="btn btn-default active" role="button">Home</a>
                <div class="btn-group">
                    <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                        Car range<span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="/showAllCars">All cars</a></li>
                        <sec:authorize access="hasRole('ROLE_ADMIN')"><li><a href="/newCar">Create new car</a></li></sec:authorize>
                        <li><a href=/findByModel>Find car by model</a></li>
                        <li><a href=/findByEngineVolume>Find car by engine volume</a></li>
                        <li><a href=/findByYearOfIssue>Find car by year of issue</a></li>
                        <sec:authorize access="hasRole('ROLE_ADMIN')"><li><a href="/deleteCar">Delete car</a></li></sec:authorize>
                    </ul>
                </div>
                <div class="btn-group">
                    <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                        Financing<span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href=/showAllFinancingTypes>All financing types</a></li>
                        <li><a href=/findByType>Find financing conditions by type</a></li>
                    </ul>
                </div>
                <div class="btn-group">
                    <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                        Order<span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href=/showAllOrders>All order</a></li>
                        <sec:authorize access="hasRole('ROLE_ADMIN')"><li><a href="/newOrder">Create new order</a></li></sec:authorize>
                        <li><a href=/findByCustomer>Find order by customer</a></li>
                        <li><a href=/findByOrderDate>Find order by order date</a></li>
                        <li><a href=/findByAuto>Find order by auto</a></li>
                        <li><a href=/findByFinType>Find order by financing type</a></li>
                        <sec:authorize access="hasRole('ROLE_ADMIN')"><li><a href="/deleteOrder">Delete order</a></li></sec:authorize>
                    </ul>
                </div>
                <div class="btn-group">
                    <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                        Parts and accessories<span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href=/showAllPartsAndAccessories>All parts and accessories</a></li>
                        <sec:authorize access="hasRole('ROLE_ADMIN')"><li><a href="/newPartsAndAccessories">Create new part or accessory</a></li></sec:authorize>
                        <li><a href=/findByName>Find parts and accessories by name</a></li>
                        <sec:authorize access="hasRole('ROLE_ADMIN')"><li><a href="/deletePartsAndAccessories">Delete part or accessory</a></li></sec:authorize>
                    </ul>
                </div>
                <div class="btn-group">
                    <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                        Technical support<span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href=/showAllTechSupport>All technical support</a></li>
                        <sec:authorize access="hasRole('ROLE_ADMIN')"><li><a href="/newTechSupport">Create new technical support</a></li></sec:authorize>
                        <li><a href=/findBySupportType>Find support type</a></li>
                        <sec:authorize access="hasRole('ROLE_ADMIN')"><li><a href="/deleteTechSupport">Delete technical support</a></li></sec:authorize>
                    </ul>
                </div>
            </div>
        </div>
        <div class="col-md-1">
            <a> </a>
        </div>
        <div class="col-md-3">
            <sec:authorize access="isAnonymous()"> <a  class="btn btn-danger" href="/loginpage" >Login</a></sec:authorize>
            <sec:authorize access="isAuthenticated()"> Hello, <a href="/myCabinet=${loginedUser.id}">${loginedUser.name}</a> <a  class="btn btn-danger" href="/logout">Logout</a></sec:authorize>
            <a class="btn btn-danger" href="/registration">Registration</a>
        </div>
    </div>
</body>
</html>
