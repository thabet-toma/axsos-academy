<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
<style>
form *{
display:block
}

</style>

</head>
<body>
<h1>Send an Omikuji!</h1>
<form action="/show" method="post">
<label>Pick any Number from 5 to 25 </label>
<input type="number" name="year">
<label>Enter the name of any City:</label>
<input type="text" name="city">
<label>Enter the name of any name person</label>
<input type="text" name="name">
<label>Enter professional endeavor or hoppy</label>
<input type="text" name="hoppy">
<label>Enter any type of living things </label>
<input type="text" name="living">
<label>say somthing nice to some one </label>
<textarea rows="11" cols="12" name="com"></textarea>
<p> send and show a friend</p>
<button>send</button>

</form>
</body>
</html>