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
<h1>
${category.name} 

</h1>
<h2>
Products
</h2>
<c:forEach var="i" items="${category.products }">
<p>${i.name }</p>
</c:forEach>
<h2>Add a Products</h2>
<form action="/AddPtoC" method="post" >
<input type="hidden" name="IdC" value="${category.id}">

<select name="category">
<c:forEach var="i" items="${products }">
<option value="${ i.id}">${i.name}</option>
</c:forEach>
</select>
  <button>submit</button>
</form>
</body>
</html>