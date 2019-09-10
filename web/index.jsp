<%--
  Created by IntelliJ IDEA.
  User: grego
  Date: 09.09.2019
  Time: 19:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Przelicznik</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
            integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
            crossorigin="anonymous"></script>
    <style>
        .head-measure {
            display: flex;
            justify-content: center;
        }

        .measure-form {
            display: flex;
            justify-content: center;
        }
    </style>
</head>
<body>
<div class="head-measure">
    <h2>Przelicznik metryczny</h2>
</div>
<div class="measure-form">
    <form action="/metric-converter">
        <div class="form-group">
            <input type="text" class="form-control" placeholder="metry" name="meterValue">
        </div>
        <div class="form-group">
            <input type="text" class="form-control" placeholder="centymetry" name="centimeterValue">
        </div>
        <div class="form-group">
            <input type="text" class="form-control" placeholder="milimetry" name="millimeterValue">
        </div>
        <button type="submit" class="btn btn-outline-primary">Przelicz</button>
    </form>
</div>
<div class="head-measure">
    <h2>Przelicznik wag</h2>
</div>
<div class="measure-form">
    <form action="/weight-converter">
        <div class="form-group">
            <input type="text" class="form-control" placeholder="kilogramy" name="kilogramValue">
        </div>
        <div class="form-group">
            <input type="text" class="form-control" placeholder="gramy" name="gramValue">
        </div>
        <div class="form-group">
            <input type="text" class="form-control" placeholder="miligramy" name="milligramValue">
        </div>
        <button type="submit" class="btn btn-outline-primary">Przelicz</button>
    </form>
</div>
</body>
</html>
