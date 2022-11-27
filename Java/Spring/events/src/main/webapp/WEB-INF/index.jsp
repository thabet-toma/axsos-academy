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
<style>
.body{
display:flex;
padding:5%
}
.body *{
margin-bottom:3%;
}
label  {
width:70px;}
</style>
</head>
<body>
<h1 style="color:blue;text-align:center">Welcome</h1>

<div class="body">
<form:form action="/register" method="post" modelAttribute="newUser">
<h2>Register</h2>
        <div class="form-group">
            <label >First name:</label>
            <form:input path="firstName" class="form-control" />
            <form:errors path="firstName" style="color:red" />
        </div>
         <div class="form-group">
            <label>Last name:</label>
            <form:input path="lastName" class="form-control" />
            <form:errors path="lastName" style="color:red" />
        </div>
        <div class="form-group">
            <label>Email: </label>
            <form:input path="email" class="form-control" />
            <form:errors path="email" class="text-danger" />
             <form:errors path="email" class="text-danger" />
        </div>
         <div class="form-group">
            <label>Email: </label>
            <form:select path="location" class="form-control" >
            <form:option value="tulkarm"></form:option>
			<form:option value="jenen">jenen</form:option>
			<form:option value="nablus">nablus</form:option>
			</form:select>
            
           
        </div>
        <div class="form-group">
            <label>Password:</label>
            <form:password path="password" class="form-control" />
            <form:errors path="password" class="text-danger" />
        </div>
        <div class="form-group">
            <label>Confirm Password:</label>
            <form:password path="confirm" class="form-control" />
            <form:errors path="confirm" class="text-danger" />
        </div>
        <input type="submit" value="Register" class="btn btn-primary" />
    </form:form>

    <form:form action="/login" method="post" modelAttribute="newLogin" style="margin-left:20%;">
    <h2>Log in</h2>
        <div class="form-group">
            <label>Email:</label>
            <form:input path="email" class="form-control" />
            <form:errors path="email" class="text-danger" />
        </div>
        <div class="form-group">
            <label>Password:</label>
            <form:password path="password" class="form-control" />
            <form:errors path="password" class="text-danger" />
        </div>
        <input type="submit" value="Login" class="btn btn-success" />
    </form:form>
    </div>
</body>
</html>