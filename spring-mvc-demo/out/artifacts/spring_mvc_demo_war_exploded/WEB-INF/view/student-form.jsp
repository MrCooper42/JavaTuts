<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Student Form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
    First name: <form:input path="firstName"/>
    <br><br>
    Last name: <form:input path="lastName"/>
    <br><br>
    <form:select path="country">
        <form:options items="${student.countryOptions}"></form:options>
        <%--vs--%>
        <%--<form:option value="USA" label="USA"></form:option>--%>
        <%--<form:option value="Canada" label="Canada"></form:option>--%>
        <%--<form:option value="Mexico" label="Mexico"></form:option>--%>
        <%--<form:option value="China" label="China"></form:option>--%>
    </form:select>
    <input type="submit" value="Submit"/>
    <br><br>
</form:form>
</body>
</html>