<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %> 
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>
<h1>${ThisDojo.name}</h1>
<table border="1">
  <tr>
<th>First Name</th>
   <th>Last Name</th>
 
   <th>Age</th>
  </tr>
 <c:forEach var="i" items="${ThisDojo.ninjas }">
 <tr>
 <td>${i.firstName}</td>
 <td>${i.lastName }</td>
 <td>${i.age }</td>
 </c:forEach>
 </table>

</body>
</html>