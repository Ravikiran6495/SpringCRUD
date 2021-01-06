<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>




<form:form action="add" modelAttribute="student">
First NAme:<form:input path="firstName"/><br>
Last Name:<form:input path="lastName"/></br>
<input type="submit" value="submit">
</form:form>



</body>
</html>