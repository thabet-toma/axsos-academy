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
<form:form action="/newProduct" method="post" modelAttribute="product">
    <p>
      <form:label path="name">name</form:label>
      <form:errors   path="name"/>
      <form:input path="name"/>
       <form:label path="description">Description</form:label>
      <form:errors   path="description"/>
      <form:input path="description"/>
       <form:label path="price">price</form:label>
      <form:errors   path="price"/>
      <form:input path="price"/>

    </p>
      <button>submit</button>
    </form:form>
</body>
</html>