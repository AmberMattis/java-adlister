<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Admin Dashboard" />
    </jsp:include>
</head>
<body>
    <jsp:include page="../WEB-INF/partials/navbar.jsp" />

    <div class="container">
        <h1>Viewing Admin Dashboard</h1>
<%--access attributes set in the session--%>
        <p>Is Admin: ${sessionScope.isAdmin}</p> <%--our attributes live in session scope this is why we can access the isAdmin session in jsp--%>
    </div>

</body>
</html>
