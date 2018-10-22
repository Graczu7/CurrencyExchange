<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!Doctype html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency table</title>
    <link rel="stylesheet" href="/webjars/bootstrap/4.1.0/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/ju/dt-1.10.18/af-2.3.2/b-1.5.4/b-flash-1.5.4/b-html5-1.5.4/datatables.min.css"/>

    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/pdfmake.min.js"></script>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/vfs_fonts.js"></script>
    <script type="text/javascript" src="https://cdn.datatables.net/v/ju/dt-1.10.18/af-2.3.2/b-1.5.4/b-flash-1.5.4/b-html5-1.5.4/datatables.min.js"></script>
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/ju/dt-1.10.18/af-2.3.2/b-1.5.4/b-flash-1.5.4/b-html5-1.5.4/datatables.min.css"/>

    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/pdfmake.min.js"></script>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/vfs_fonts.js"></script>
    <script type="text/javascript" src="https://cdn.datatables.net/v/ju/dt-1.10.18/af-2.3.2/b-1.5.4/b-flash-1.5.4/b-html5-1.5.4/datatables.min.js"></script>
</head>
<body>
    <jsp:include page="WEB-INF/fragments/header.jsp"/>
        <div class="container mt-3">
            <input id="actualDateId" class="form-control container mt-1" value="2018-10-14" readonly>
            <table class="table table-hover" id ="CurrencyListExchange" style="width: 100%">
                <thead>
                    <tr>
                        <th>Currency name</th>
                        <th>Purchase</th>
                        <th>Sale</th>
                    </tr>
                </thead>

            </table>
        </div>
    <jsp:include page="WEB-INF/fragments/footer.jsp"/>
</body>
</html>

<script>
$(document).ready(function () {
    $('.display tbody').DataTable({
        ajax: {
            url: '/NbpExchangeCalcSeriesResponse',
            method: "GET"
        }
    },NbpExchangeCalcSeriesResponse
        columns: [
        {data: "b.NbpExchangeCalcSeriesResponse"},
        {data: "b.Code"},
        {data: "b.Code"},
    ]
    });
// zrobić to inaczej? jak wcześniej
    // odnieść się do Listy jsonów i wyciągnąć dwie dane, code i rate a trzeci argument to rate pomniejszony o prowizję
</script>
