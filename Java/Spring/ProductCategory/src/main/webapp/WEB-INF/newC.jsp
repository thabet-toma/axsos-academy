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
<form:form action="/newCategory" method="post" modelAttribute="category">
    <p>
      <form:label path="name">name</form:label>
      <form:errors   path="name"/>
      <form:input path="name"/>
   

    </p>
      <button>submit</button>
    </form:form>
</body>
</html>