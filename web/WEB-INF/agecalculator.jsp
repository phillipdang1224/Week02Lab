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
        <h1>Age Calculator</h1>
                <form method="post" action="helloworld">
        Enter your age: <input type ="text" name="age" value= ""><br>
        <input type="submit" value ="Submit">
        </form>
        <div>${message}</div>
    </body>
</html>
