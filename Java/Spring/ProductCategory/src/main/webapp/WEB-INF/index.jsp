
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
<a href="Product/new">New product</a>
<a href="Category/new">New category</a>



<table border="1">

  <tr>
<th>Products</th>
   <th>Category</th>
 
  
  </tr>
  
  <tr>
  <td>
  <ul>
  <c:forEach var="i" items="${product }">
<li> <a href="product/${i.id}">${i.name}</a></li>
 </c:forEach>
 </ul>
 </td>
  <td>
  <ul>
 <c:forEach var="i" items="${category}">
<li> <a href="category/${i.id}">${i.name}</a></li>
 </c:forEach>
 </ul>
 </td>
 
 </tr>
 </table>
 
 

</body>
</html>