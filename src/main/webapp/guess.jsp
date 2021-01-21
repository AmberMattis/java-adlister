<%--
  Created by IntelliJ IDEA.
  User: ambermattis
  Date: 1/21/21
  Time: 4:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guessing Game</title>
</head>
<body>
<h3> Enter an number between 1 and 3 </h3>
<form action="/guess" method="post">
    <input name="number" id="number" type="text">
    <button type="submit">Submit</button>
</form>

</body>
</html>
