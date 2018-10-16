<%--
  Created by IntelliJ IDEA.
  User: Robert
  Date: 16/10/2018
  Time: 19:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency table</title>
    <link rel="stylesheet" href="/webjars/bootstrap/4.1.0/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
</head>
<body>
    <jsp:include page="WEB-INF/fragments/header.jsp"/>
        <div class="container mt-3">
            <div class="container mt-1">Today's date: <%= (new java.util.Date()).toLocaleString()%></div>
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>Currency name</th>
                        <th>Purchase</th>
                        <th>Sale</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>...</td>
                        <td>...</td>
                        <td>...</td>
                    </tr>
                </tbody>
            </table>
        </div>
    <jsp:include page="WEB-INF/fragments/footer.jsp"/>
</body>
</html>
