<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>mainRegister</title>
    <link rel="stylesheet" href="/webjars/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>

<jsp:useBean id="customer" class="jsp.Customer" scope="session">
    <jsp:setProperty name="customer" property="*"/>
</jsp:useBean>

<div class="alert alert-success" role="alert">
    <strong>Username: </strong>
    <jsp:getProperty name="customer" property="username"/>
</div>
<div class="alert alert-danger" role="alert">
    <strong>Password: </strong>
    <jsp:getProperty name="customer" property="password"/>
</div>
<div class="alert alert-info" role="alert">
    <strong>Gender: </strong>
    <jsp:getProperty name="customer" property="gender"/>
</div>
<div class="alert alert-info" role="alert">
    <strong>Email: </strong>
    <jsp:getProperty name="customer" property="email"/>
</div>
<div class="alert alert-info" role="alert">
    <strong>Phone: </strong>
    <jsp:getProperty name="customer" property="phone"/>
</div>
</body>
</html>
