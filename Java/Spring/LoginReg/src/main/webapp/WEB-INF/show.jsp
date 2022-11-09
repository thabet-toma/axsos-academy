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
<h1>Welcome</h1>
<h2>${book.title}</h2>
<a href="/home" >back to the shelves</a>
<h3>${book.user.userName } Read ${book.title} by ${book.author}</h3>
<h3>Here is ${book.user.userName }'s thoughts:</h3>
<br>
<hr>
<br>

<p> ${book.thought} </p>
<br>
<hr>

<c:choose>
<c:when test="${userId==book.user.id }">
<form:form action="/update/${book.id}" method="post" modelAttribute="updatebook">
                            <input type="submit" class="form-control" value="Edit">
        </form:form> 
        <form:form action="/delete/${book.id}" method="post">
                            <input type="submit" class="form-control" value="Delete">
        </form:form>
</c:when>
</c:choose>
</body>
</html>