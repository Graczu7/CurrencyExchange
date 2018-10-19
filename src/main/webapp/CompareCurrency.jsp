<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!Doctype html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency table</title>
    <link rel="stylesheet" href="/webjars/bootstrap/4.1.0/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz" crossorigin="anonymous">
</head>
<body>
    <jsp:include page="WEB-INF/fragments/header.jsp"/>
        <div class="container mt-3">
            <input id="actualDateId" class="form-control container mt-1" value="2018-10-14" readonly>
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>Currency name</th>
                        <th>Purchase</th>
                        <th>Sale</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody id="contentWrapperId">

                </tbody>
            </table>
        </div>
    <jsp:include page="WEB-INF/fragments/footer.jsp"/>
</body>
</html>

<script>
    var trHTML = '';
    $.each(data.currency, function (i, value) {
        trHTML += '<tr><td>' + value.code + '</td><td>' + (value.ask)*0.95 + '</td><td>' + value.ask + '</td></tr>';
    });
    $('#contentWrapperId').append(trHTML);
    $(document).ready(function () {

        setTimeout(function () {
            $('#actualDateId').val(new Date())
        }, 2000);
    });

</script>
