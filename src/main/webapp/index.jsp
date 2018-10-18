<%@page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>CurrencyExchange</title>
    <link rel="stylesheet" href="/webjars/bootstrap/4.1.0/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
</head>

<body>
<jsp:include page="WEB-INF/fragments/header.jsp"/>
<div class="container mt-3">
    <a href="/CompareCurrency">
        <button type="button" class="btn btn-outline-secondary">Compare Currency</button>
    </a>
    <a href="/ExchangeMoney">
        <button type="button" class="btn btn-outline-secondary">Exchange Currency</button>
    </a>
    <a href="AboutAuthors.jsp">
        <button type="button" class="btn btn-outline-secondary">About Authors</button>
    </a>

</div>

<jsp:include page="WEB-INF/fragments/footer.jsp"/>
</body>

</html>