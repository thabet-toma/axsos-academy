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
div *{
margin:0 auto;
text-align:center;
margin-top:6px;


}
div{
margin:6%;
}
.red{
color:red;
}
</style>
</head>
<body>
  <div style="padding:auto 0">

<table border="1">
  <tr>
<th>Name</th>
   <th>creator</th>
   <th>curentVersion</th>
   <th style="width:100px">Actions</th>
  </tr>
 <c:forEach var="i" items="${Travel }">
 <tr>
 <td><a href="/show/${i.id}">${i.name }</a></td>
 <td>${i.creator }</td>
 <td>${i.currentVersion }</td>
 <td style="display:flex;align-items:center;"><a href="/edit/${ i.id}">edit</a><form action="/delete/${i.id}" method="post">
    <input type="hidden" name="_method" value="delete">
    <button style="background-color:red;margin-top:0px;">Delete</button>
</form>
</td>
 
 </tr>
 </c:forEach>
  
</table>

</div>
<div>
 
 
  <form:form action="/" method="post" modelAttribute="travel">
    <p>
      <form:label path="name">name</form:label>
      <form:errors class="red"   path="name"/>
      <form:input path="name"/>

    </p>
    <p>
      <form:label path="creator">creator</form:label>
      <form:errors class="red" path="creator"/>
      <form:input path="creator"/>

    </p>
    <p>
      <form:label path="currentVersion">currentVersion</form:label>
      <form:errors class="red" path="currentVersion"/>
      <form:input path="currentVersion"/>

    </p>
 
    <button>submit</button>
  </form:form>
</div>
</body>
</html>