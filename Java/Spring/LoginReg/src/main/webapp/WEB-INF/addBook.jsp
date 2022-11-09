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
<h1>Add a Book to your shelf</h1>
<form:form action="/CreateBook" method="post" modelAttribute="book">
<h2>Register</h2>
        <p>
            <label>Title</label>
            <form:input path="title"  />
            <form:errors path="title" style="color:red" />
        </p>
        <p>
            <label>Author</label>
            <form:input path="author"  />
            <form:errors path="author"  style="color:red" />
        </p>
        <p>
            <label>My Thought</label>
            <form:textarea path="thought" class="form-control" />
            <form:errors path="thought"  style="color:red" />
        <p>
        <form:input type="hidden" path="user" value="${userId }"/>
        <button>submit</button>
        </form:form>
</body>
</html>