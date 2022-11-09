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
<h1 style="color:purple">Welcome, ${user.userName }</h1>
<p>Books from evryone's</p>
<a href="/logout">logout</a>
<a href="/AddBook">Add to my Shell</a>
<table border="1">
<tr>
<th>Id</th>
<th>Title</th>
<th>Author Name</th>
<th>Posted by</th>
</tr>
<c:forEach var="i" items="${AllBook}">
<tr> 
<td><c:out value="${i.id}"/></td>
<td><a href="/book/${i.id}">${i.title}</a></td>
<td>${i.author}</td>
<td>${i.user.userName}</td>

</tr>
</c:forEach>

</table>

</body>
</html>