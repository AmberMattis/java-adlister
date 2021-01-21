<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LOGIN</title>
</head>
<body>

    <form action="login.jsp" method="post">
        <p>Sign In</p>
        <input type="username" name="username" id="username" placeholder="Enter a username">
        <input type="password" name="password" id="password" pattern="Enter password">
        <button type="submit">Login</button>
    </form>

<%--Inside of login.jsp write some code to check the submmitted values. If the username submitted
 is "admin", and the password is "password", redirect the user to the profile page; otherwise, redirect
  back to the login form--%>



</body>
</html>