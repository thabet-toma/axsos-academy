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
<div>
<p>Expense Name:  ${Travel.name }</p>
<p>Expense Description:   ${Travel.creator }</p>

<p> Amount spent:  ${Travel.currentVersion }</p>

</div>
</body>
</html>