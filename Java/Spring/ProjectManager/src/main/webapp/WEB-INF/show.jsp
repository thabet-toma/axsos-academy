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
<h1>Project Detailes</h1>
<p>${project.title }</p>
<p>${project.description }</p>
<p>${project.dueDate}
<a href="/delete/${project.id}"><button style="background-color:red">Delete</button></a>
</body>
</html>