<%-- 
    Document   : agecalculator
    Created on : Sep 14, 2018, 3:17:49 PM
    Author     : 747787
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type ="text" name="numOne" value= "${numOne}"><br>
            Second: <input type ="text" name="numTwo" value= "${numTwo}"><br>
            <input type="submit" value ="+" name="operation">
            <input type="submit" value ="-" name="operation">
            <input type="submit" value ="*" name="operation">
            <input type="submit" value ="%" name="operation">
        </form>
        Result: ${product}<br>
        <a href="age">Age Calculator</a>
    </body>
</html>