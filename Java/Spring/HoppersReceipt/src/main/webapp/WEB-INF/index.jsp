<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
 
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!-- New line below to use the JSP Standard Tag Library -->


    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>
<h1>Customer Name:{c:out name}</h1>
<h3>Item name:{item}</h3>
<h3>Description:{description}</h3>
<h3>price:{price}</h3>
<h3>vendor:{vendor}</h3>
</body>
</html>