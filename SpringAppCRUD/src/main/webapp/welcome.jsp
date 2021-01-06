<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>





<table border="1">
<tr>
<th>First Name</th>
<th>Last Name</th>
</tr>
<c:forEach var="student" items="${studentlist}">
<tr>
<th>${student.firstName}</th>
<th>${student.lastName}</th>
<th><a href="http://localhost:8084/${student.id}">Edit</a></th>
<th><a href="http://localhost:8084/delete/${student.id}">Delete</a></th>
</tr>

</c:forEach>

</table>


<a href="http://localhost:8084/home">Add</a>



</body>
</html>