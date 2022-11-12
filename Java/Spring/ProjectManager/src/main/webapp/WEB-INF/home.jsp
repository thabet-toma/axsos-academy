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
<h1 style="color:purple;display:inline-block">Welcome, ${user.firstName }</h1>
          <a href="/logout" style="margin-left:3%;">Logout</a>
         <div> <p>All projects</p> <a href="/projects/new"><button>+ new project</button></a></div>
          <table border="1">
<thead>
<tr>
<th>Project</th>
<th>Team Lead</th>
<th>Due Date</th>

<th>Actions</th>
</tr>
</thead>
<c:forEach var="i" items="${projects}">
<tr> 
<td><a href="/project/${i.id}"><c:out value="${i.title}"/></a></td>
<td>${i.userCreator.firstName}</td>
<td>${i.dueDate}</td>




<td>
<form:form action="/join/${i.id }" method="post" >
                            <input type="submit" class="form-control" value="join Poroject">
        </form:form> 
        </td>


</tr>
</c:forEach>
</table>
<p> your projects</p>
  <table border="1">
<thead>
<tr>
<th>Project</th>
<th>Team Lead</th>
<th>Due Date</th>

<th>Actions</th>
</tr>
</thead>
<c:forEach var="i" items="${myP}">
<tr> 
<td><a href="/project/${i.id}"><c:out value="${i.title}"/></a></td>
<td>${i.userCreator.firstName}</td>
<td>${i.dueDate}</td>




<c:choose>

<c:when test="${user.id==i.userCreator.id }">
<td>
<a href="/update/${i.id}"><button>Edit</button></a>
       </td>
</c:when>
<c:otherwise>
<td>
<form:form action="/Leave/${i.id}" method="post" >

                            <input type="submit" class="form-control" value="Leave Teame">
                            
        </form:form> </td>
</c:otherwise>
</c:choose>


</tr>
</c:forEach>
</table>
</body>
</html>