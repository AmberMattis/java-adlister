<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    if(request.getMethod().equalsIgnoreCase("post")){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("admin") && password.equalsIgnoreCase("password")){
            response.sendRedirect("/profile");
        }
    }
%>
<html>
<head>
    <title>LOGIN</title>
</head>
<body>

    <form action="login.jsp" method="post">
        <p>Sign In</p>
        <input type="username" name="username" id="username" placeholder="Enter a username">
        <input type="password" name="password" id="password" placeholder="Enter password">
        <button type="submit">Login</button>
    </form>


<%--    <c:choose>--%>
<%--        <c:when>--%>

<%--        </c:when>--%>

<%--        <c:otherwise>--%>

<%--        </c:otherwise>--%>

<%--    </c:choose>--%>



<%--Inside of login.jsp write some code to check the submmitted values. If the username submitted
 is "admin", and the password is "password", redirect the user to the profile page; otherwise, redirect
  back to the login form--%>



</body>
</html>