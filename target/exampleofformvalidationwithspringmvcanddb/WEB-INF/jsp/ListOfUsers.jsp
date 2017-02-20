<%--
  Created by IntelliJ IDEA.
  User: octavian
  Date: 2/20/17
  Time: 5:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div align="center">
        <table border="0">
            <tr>
                <td colspan="2" align="center"><h2>Registration Succeeded!</h2></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <h3>List of users:</h3>
                </td>
            </tr>
            <c:forEach var="listVar" items="${users}">
                <tr><td>
                    <c:out value="${listVar.username}"/>
                </td>></tr>
                <tr><td>
                    <c:out value="${listVar.email}"/>
                </td>></tr>

            </c:forEach>
        </table>


    </div>

</body>
</html>
