<%-- 
    Document   : ageCalculator
    Created on : Sep 27, 2020, 7:37:50 PM
    Author     : 759005
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="" method="post">
            Enter your age <input type="text" name="age"/><br/>
            <input type="submit" value="Age next birthday"/><br/>
        <p>${message}</p>
        </form>
        <a href="/Week3lab_Calculators/arithmeticCalculator">Arithmetic Calculator</a><br/>
    </body>
</html>
