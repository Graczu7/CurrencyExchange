<%@page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8" %>
<!Doctype html>
<html lang="pl">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Authors</title>
    <link rel="stylesheet" href="/webjars/bootstrap/4.1.0/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz" crossorigin="anonymous">

</head>
<body>
<jsp:include page="WEB-INF/fragments/header.jsp"/>
<div class="container mt-3">
<table class="table table-sm table-dark">
    <thead>
    <tr>
        <th scope="col">:)</th>
        <th scope="col">Name</th>
        <th scope="col">Surname</th>
        <th scope="col">LinkedIn</th>
        <th scope="col">GitHub</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <th scope="row">1</th>
        <td>Grzgorz</td>
        <td>Gracz</td>
        <td>
            <a target="_blank" href="https://www.linkedin.com/in/grzegorz-gracz-077506163/" class="text-blue">Select</a>
        </td>
        <td>
            <a target="_blank" href="https://github.com/Graczu7" class="text-blue">Select</a>
        </td>
    </tr>
    <tr>
        <th scope="row">2</th>
        <td>Robert</td>
        <td>Kowal</td>
        <td>
            <a target="_blank" href="https://www.linkedin.com/in/robert-k-a75a1a83/" class="text-blue">Select</a>
        </td>
        <td>
            <a target="_blank" href="https://github.com/robertkkrakow" class="text-blue">Select</a>
        </td>
    </tr>
    <tr>
        <th scope="row">3</th>
        <td>Artur</td>
        <td>Gurak-Brzozowski</td>
        <td>
            <a target="_blank" href="https://www.linkedin.com/in/artur-gurak-brzozowski-72524116a/" class="text-blue">Select</a>
        </td>
        <td>
            <a target="_blank" href="https://github.com/ArtoisGB" class="text-blue">Select</a>
        </td>
    </tr>
    </tbody>
</table>
</div>

<jsp:include page="WEB-INF/fragments/footer.jsp"/>
</body>
</html>
