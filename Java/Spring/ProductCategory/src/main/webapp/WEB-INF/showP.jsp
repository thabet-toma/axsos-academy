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
${product.name} 

</h1>
<h2>
Categories
</h2>
<c:forEach var="i" items="${product.categories }">
<p>${i.name }</p>
</c:forEach>
<h2>Add a Category</h2>
<form action="/AddCtoP" method="post" >
<input type="hidden" name="IdP" value="${product.id}">

<select name="category">
<c:forEach var="i" items="${categories }">
<option value="${ i.id}">${i.name}</option>
</c:forEach>
</select>
  <button>submit</button>
</form>
</body>
</html>