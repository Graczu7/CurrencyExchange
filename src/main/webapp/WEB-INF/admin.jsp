<%@ page import="jsp.Customer" %>
<%@ page import="filters.User" %>
<%@ page import="com.example.currencyexchange.filters.User" %>
<%@page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="/webjars/bootstrap/4.1.0/css/bootstrap.min.css">
</head>
<body>
<div class="jumbotron jumbotron-fluid">
    <div class="container">
        <% User user = (User) request.getSession().getAttribute("user"); %>
        <p>Name: <%=user.getUsername() %>
        </p>
    </div>
</div>
</body>
</html>

