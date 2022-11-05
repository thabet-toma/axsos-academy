<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>
    <h1>All Books</h1>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Title</th>
                <th>Language</th>
                <th>Number of Pages</th>
                
            </tr>
        </thead>
        <tbody>
     <c:forEach var="i" items="${books}">
     <tr>
     <td>${i.id }</td>
      <td><a href="/books/${i.id}">${i.title }</a></td>
       <td>${i.language }</td>
        <td>${i.numberOfPages }</td>
     </c:forEach>
        </tbody>
    </table>
</body>
</html>