<%@ page import="jsp.Customer" %>
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
        <% Customer customer = (Customer) request.getAttribute("customer"); %>
        <p>Username: <%=customer.getUsername() %>
        </p>
        <p>Password: <span class="badge badge-secondary"><%=customer.getPassword() %></span></p>
        <p>Gender: <%=customer.getGender() %>
        </p>
        <p>Email: <%=customer.getEmail() %>
        </p>
        <p>Phone: <%=customer.getPhone() %>
        </p>
    </div>
</div>
</body>
</html>