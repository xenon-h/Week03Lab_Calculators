<%-- 
    Document   : arithmeticCalculator
    Created on : Sep 27, 2020, 7:38:05 PM
    Author     : 759005
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="" method="post">
             First:<input type="text" name="first" value="${first}"/><br/>
             Second:<input type="text" name="second" value="${second}"/><br/>
             <button name="operator" value="+">+</button>
             <button name="operator" value="-">-</button>
             <button name="operator" value="*">*</button>
             <button name="operator" value="%">%</button><br/>
             <p>${result}</p>
        </form>
        <a href="/Week3lab_Calculators/">Age Calculator</a><br/>
    </body>
</html>
