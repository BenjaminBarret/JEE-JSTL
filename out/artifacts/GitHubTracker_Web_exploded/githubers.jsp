<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: wilder
  Date: 30/05/18
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="header.jsp"/>
</head>
<body>
    <h1>Githubers !</h1>

    <jsp:include page="navbar.jsp"/>

    <ul>
        <c:forEach items ="${requestScope.maliste}" var="githubers">
            <li>
                    ${githubers.name}
            </li>
        </c:forEach>
    </ul>

    <jsp:include page="footer.jsp"/>
</body>
</html>
