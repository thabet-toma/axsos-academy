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
<h1>edit your Project</h1>
<form:form action="/editP" method="post" modelAttribute="project">
<h2>Register</h2>
        <p>
            <label>Project Title</label>
            <form:input path="title" value="${project.title }" />
            <form:errors path="title" style="color:red" />
        </p>
       
        <p>
            <label>Description</label>
            <form:textarea path="description" class="form-control" value="${project.description}" />
            <form:errors path="description"  style="color:red" />
        <p>
        <p>
            <label>Due date</label>
            <form:input type="Date" path="dueDate" value="${dt}" class="form-control" />
            <form:errors path="dueDate"  style="color:red" />
        <p>
        <form:input type="hidden" path="id" value="${project.id }" />
         <form:input type="hidden" path="userCreator" value="${project.userCreator.id }" />
         
       
       
        <button>submit</button>
        </form:form>
</body>
</html>