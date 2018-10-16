<!Doctype html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="pl">
<head>
    <title>WTT onion to pessos!!</title>
    <link rel="stylesheet" href="/webjars/bootstrap/4.1.0/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
</head>

<body>
<jsp:include page="WEB-INF/fragments/header.jsp"/>
<div class="container mt-4">
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
        <option>GBP</option>
        <option>USD</option>
        <option>EUR</option>
        <option>CNY</option>
    </select>
    <label for="ExampleInputPLN" id="labelResultId">Wartosc w GBP</label>
    <input type="number" class="form-control" id="ExampleInputGBP" >
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