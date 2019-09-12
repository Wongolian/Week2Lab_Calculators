<%-- 
    Document   : agecalculator
    Created on : 12-Sep-2019, 12:09:21 PM
    Author     : Steven
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        
        <form action="age" method="post">
            Enter your age: <input type="number" name="age" min="0"><br>
            <input type="submit" value="Age next birthday">
            <br>
            <span>${answer}</span>
            <br>
            <a href="/arithmetic">Arithmetic Calculator</a>
        </form>
    </body>
</html>
