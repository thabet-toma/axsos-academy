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
<h3 style="color:green">hello,${user.userName} welcome to </h3>
<h1>The Book broker </h1>
<a href="/home">Back to the shelves</a>
<h3>Available Book to Borrow </h3>
<table border="1">
<tr>
<th>Id</th>
<th>Title</th>
<th>Author Name</th>
<th>Posted by</th>
<th>Actions</th>
</tr>
<c:forEach var="i" items="${booksp}">
<tr> 
<td><c:out value="${i.id}"/></td>
<td><a href="/book/${i.id}">${i.title}</a></td>
<td>${i.author}</td>
<td>${i.user.userName}</td>
<c:choose>

<c:when test="${userId==i.user.id }">
<td>
<form:form action="/update/${i.id}" method="post" modelAttribute="updatebook">
                            <input type="submit" class="form-control" value="Edit">
        </form:form> 
        <form:form action="/delete/${i.id}" method="post">
                            <input type="submit" class="form-control" value="Delete">
        </form:form></td>
</c:when>
<c:otherwise>
<td>
<form:form action="/borrow/${i.id}" method="post" >

                            <input type="submit" class="form-control" value="borrow">
                            
        </form:form> </td>
</c:otherwise>
</c:choose>

</tr>
</c:forEach>
</table>
<h1>Books i'm Borrowing</h1>
<table border="1">
<tr>
<th>Id</th>
<th>Title</th>
<th>Author Name</th>
<th>Posted by</th>
<th>Actions</th>
</tr>
<c:forEach var="i" items="${user.bookp}">
<tr> 
<td><c:out value="${i.id}"/></td>
<td><a href="/book/${i.id}">${i.title}</a></td>
<td>${i.author}</td>
<td>${i.user.userName}</td>
<td>
<form:form action="/return/${i.id}" method="post" >
                            <input type="submit" class="form-control" value="return">
        </form:form> </td>


</tr>
</c:forEach>
</table>


</body>
</html>