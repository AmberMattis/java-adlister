<%--
  Created by IntelliJ IDEA.
  User: ambermattis
  Date: 1/28/21
  Time: 3:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<h1>Create An Account</h1>
<form action="/register" method="post">


    <label for="username">Username</label>
    <input id="username" name="username" type="text">

    <br><br>

    <label for="email">Email</label>
    <input id="email" name="email" type="text">

    <br><br>

    <label for="password">Password</label>
    <input id="password" name="password" type="hidden">

    <br><br>


</form>

</body>
</html>
