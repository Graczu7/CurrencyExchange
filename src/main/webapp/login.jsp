<%@page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Table rows%cols</title>
    <link rel="stylesheet" href="/webjars/bootstrap/4.1.0/css/bootstrap.min.css">
</head>
<body>
<form action="LoginServlet" method="POST">

    <div class="form-group">
        <label for="exampleInputLogin1">Login</label>
        <input type="text" class="form-control" id="exampleInputLogin1" name="login" placeholder="Login">
    </div>
    <div class="form-group">
        <label for="exampleInputPassword1">Password</label>
        <input type="password" class="form-control" id="exampleInputPassword1" name="password" placeholder="Password">
    </div>

    <button type="submit" class="btn btn-primary">Submit</button>

</form>
</body>
</html>