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
<form:form action="/updateEvent/${event.id}" method="post" modelAttribute="event">
<h2>Register</h2>
        <p>
            <label>Name</label>
            <form:input path="name"  />
            <form:errors path="name" style="color:red" />
        </p>
       
        <p>
            <label>Date</label>
            <form:input type="date" path="date" class="form-control" />
            <form:errors path="date"  style="color:red" />
        </p>
      
        <p>
         <form:select path="location" class="form-control" >
            <form:option value="tulkarm">tulkarm</form:option>
			<form:option value="jenen">jenen</form:option>
			<form:option value="nablus">nablus</form:option>
			
			</form:select>
			</p>
			 <form:input type="hidden" path="userCreator" value="${user.id }"/> 

       
        <button>submit</button>
        </form:form>
</body>
</html>