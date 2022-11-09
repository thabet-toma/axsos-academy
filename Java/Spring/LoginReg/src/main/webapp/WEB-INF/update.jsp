<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %> 
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Change your Entry </h1>
<a href="/home" >back to the shelves</a>


<form:form action="/edit/${book.id}" method="put" modelAttribute="updatebook">
            <form:input type="hidden" path="user"  value="${userId}"/>
        <input type="hidden" name="_method" value="put">
        <table>
            <tr>
                <td>
                    <form:label path="title">title</form:label>
                    <form:input path="title" class="form-control"/>
                    <form:errors path="title" class="red"/>
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="author">author</form:label>
                    <form:input class="author" path="author"/>
                    <form:errors path="author" class="red"/>

                </td>
            </tr>
            <tr>
                <td>
                    <form:label  path="thought">mythouths</form:label>
                    <form:input class="form-control" path="thought"/>
                    <form:errors path="thought" class="red"/>

                </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" class="form-control" value="Update">
                </td>
            </tr>

        </table>

</form:form>
</body>
</html>
