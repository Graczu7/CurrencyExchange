<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!Doctype html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="pl">
<head>
    <title>Internet currency exchange</title>
    <link rel="stylesheet" href="/webjars/bootstrap/4.1.0/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz" crossorigin="anonymous">
</head>

<body>
<jsp:include page="WEB-INF/fragments/header.jsp"/>
<div class="container mt-3">
    <div class="form-group">
        <label for="ExampleInputPLN">Wartość w PLN:</label>
        <input type="number" class="form-control" id="ExampleInputPLN" placeholder="PLN">
    </div>

    <div class="form-group">
        <label for="ExampleInputData">Data:</label>
        <input type="date" class="form-control" id="ExampleInputData" placeholder="DATA">
    </div>

    <div class="form-group">
        <label for="sel1">Select list:</label>
        <select class="form-control" id="sel1">
            <c:forEach var="currency" items="${currencies}">
                <option>${currency}</option>
            </c:forEach>
        </select>
        <label for="ExampleInputPLN" id="labelResultId">Wartosc </label>
        <input type="number" class="form-control" id="ExampleInputGBP" readonly>
    </div>

    <div>
        <button type="button" class="btn btn-success" id="exchangeBtnId">Przelicz</button>
    </div>
</div>
<jsp:include page="WEB-INF/fragments/footer.jsp"/>
</body>
</html>

<script>
    $('#sel1').change(function () {
        $('#labelResultId').html('');
        $('#labelResultId').append('Wartosc w ' + $('#sel1').val());
    });

    $('#exchangeBtnId').click(function () {
        $.ajax({
            type: "POST",
            url: '/exchange/',
            contentType: 'application/json',
            data: JSON.stringify({
                value: $('#ExampleInputPLN').val(),
                exchangeDate: $('#ExampleInputData').val(),
                currency: $('#sel1').val()
            }),
            success: function (result) {
                $('#ExampleInputGBP').val(result.value)
            },
            error: function (result) {
                alert(result.error)
            }
        })
    });

</script>