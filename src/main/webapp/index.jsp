<%@page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>CurrencyExchange</title>
    <link rel="stylesheet" href="/webjars/bootstrap/4.1.0/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz" crossorigin="anonymous">
</head>

<body>
<jsp:include page="WEB-INF/fragments/header.jsp"/>
<div align="center">
    <br>
    <h1>WELCOME</h1>
</div>
<br>
<div class="container mt-3" align="center">
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

<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<!-- NO SORRY -->

<jsp:include page="WEB-INF/fragments/footer.jsp"/>

<div>
    This website was created for the needs of the final project on a course organized by SDA.
</div>
<div>
    Service has been developed in the field of JAVA technology by the best programs from Krakow who are juniors.
</div>
<div>
    We encourage you to use our website for free. You can compare the best-known currencies from around the world and have a good time.
</div>

</body>

</html>