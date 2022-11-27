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
       
          <table border="1">
<thead>
<tr>
<th>Name</th>
<th>Date</th>
<th>Location</th>
<th>host</th>
<th style="width:120px">Action/State</th>
</tr>
</thead>
<c:forEach var="i" items="${EventMyloc}">
<tr> 
<td><a href="/project/${i.id}"><c:out value="${i.name}"/></a></td>
<td>${i.date}</td>
<td>${i.location}</td>
<td>${i. userCreator.firstName}</td>





<c:choose>
<c:when test="${ i.getInvolveUsers().contains(user)}">
<td>
<p>Joined</p>
<form action="/cancel/${i.id }" method="post" >
                            <button>cancel</button>
        </form> 
        </td>
        </c:when>
        
 <c:when test="${ i.userCreator.id==user.id}">
 <td>
 <form action="/edit/${i.id}"  >
                            <input type="submit" class="form-control" value="edit">
                            </form>
                             <form action="/delete/${i.id }" method="post" >
                            <input type="submit" class="form-control" value="delete">
        </form> 
        </td>
        
 </c:when>
 
 <c:otherwise>
 <td>
  <form action="/join/${i.id }" method="post">
  <!-- <input type="submit" class="form-control" value="join"> -->
  <button>join</button>
 </form>
 </td>
 </c:otherwise>
 
 </c:choose> 


</tr>
</c:forEach>
</table>
<p>.................</p>
 <table border="1">
<thead>
<tr>
<th>Name</th>
<th>Date</th>
<th>Location</th>

<th>host</th>
<th>Action/State</th>
</tr>
</thead>
<c:forEach var="i" items="${EventOtherLoc}">
<tr> 
<td><a href="/project/${i.id}"><c:out value="${i.name}"/></a></td>
<td>${i.date}</td>
<td>${i.location}</td>
<td>${i. userCreator.firstName}</td>





<c:choose>
<c:when test="${ i.getInvolveUsers().contains(user)}">
<td>
<p>Joined</p>
<form action="/cancel/${i.id }" method="post" >
  <input type="submit" class="form-control" value="cancel">
        </form> 
        </td>
        </c:when>
 <c:when test="${ i.userCreator.id==user.id}">
 <td>
 <form action="/edit/${i.id}"  >
                            <input type="submit" class="form-control" value="edit">
                            </form>
                             <form action="/delete/${i.id }" method="post" >
                            <input type="submit" class="form-control" value="delete">
        </form> 
        </td>
        
 </c:when>
 <c:otherwise>
 <td>
  <form action="/join/${i.id }" method="post" >
   <input type="submit" class="form-control" value="join">
    </form></td>
 </c:otherwise>
 </c:choose> 


</tr>
</c:forEach>
</table>
<p>create an Event</p>
<form:form action="/CreateEvent" method="post" modelAttribute="event">
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