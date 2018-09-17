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
        First: <input type ="text" name="numOne" value= ""><br>
        Second: <input type ="text" name="numTwo" value= ""><br>
        <input type="submit" value ="+" name="+">
        <input type="submit" value ="-" name="-">
        <input type="submit" value ="*" name="*">
        <input type="submit" value ="%" name="%">
        </form>
        Result = ${product}
        <div>${message}</div>
        <a href="age">back</a>
    </body>
</html>