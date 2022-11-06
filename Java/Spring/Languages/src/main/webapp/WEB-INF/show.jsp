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
<div><h1>Expense Details</h1>
<p>Expense Name:  ${Travel.expense }</p>
<p>Expense Description:   ${Travel.description }</p>
<p>Vendor:   ${Travel.vendor }</p>
<p> Amount spent:  ${Travel.amount }</p>

</div>
</body>
</html>