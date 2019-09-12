<%-- 
    Document   : arithmeticcalculator
    Created on : 12-Sep-2019, 12:59:14 PM
    Author     : Steven
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form name="arithmetic" method="post">
            First: <input type="number" name="first" value="${fvalue}"><br>
            Last: <input type="number" name="last" value="${lvalue}"><br><br>
            <input type="submit" value="+" formaction="?action=add">
            <input type="submit" value="-" formaction="?action=sub">
            <input type="submit" value="*" formaction="?action=multi">
            <input type="submit" value="%" formaction="?action=modu">
            <br>
            <br>
            <span>${answer}</span>
        </form>
        
        <a href="/age">Age Calculator</a>
    </body>
</html>
