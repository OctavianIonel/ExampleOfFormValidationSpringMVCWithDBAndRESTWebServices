<%--
  Created by IntelliJ IDEA.
  User: octavian
  Date: 2/20/17
  Time: 5:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Registration Successful</title>
</head>
<body>
<div align="center">
    <table border="0">
        <tr>
            <td colspan="2" align="center"><h2>Registration Succeeded!</h2></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <h3>Thank you for registering! Here's the review of your details:</h3>
            </td>
        </tr>
        <tr>
            <td>User Name:</td>
            <td>${userForm.username}</td>
        </tr>
        <tr>
            <td>E-mail:</td>
            <td>${userForm.email}</td>
        </tr>
        <tr>
            <td>Birthday:</td>
            <td>${userForm.birthday}</td>
        </tr>
        <tr>
            <td>Profession:</td>
            <td>${userForm.profession}</td>
        </tr>

    </table>
</div>
</body>
</html>
