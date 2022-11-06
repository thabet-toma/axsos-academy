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
<h1>Edit Expense</h1>
<form:form action="/edit/${Traveledit.id}" method="post" modelAttribute="travel">
<input type="hidden" name="_method" value="put">
  <p>
      <form:label path="name">name</form:label>
      <form:errors class="red"   path="name"/>
      <form:input path="name" value="${Traveledit.name }"/>

    </p>
    <p>
      <form:label path="creator">creator</form:label>
      <form:errors class="red" path="creator"/>
      <form:input path="creator" value="${Traveledit.creator }"/>

    </p>
    
    <p>
      <form:label path="currentVersion">currentVersion</form:label>
      <form:errors class="red" path="currentVersion"/>
      <form:input path="currentVersion" value="${Traveledit.currentVersion }"/>

    </p>
    <button>submit</button>

</form:form>
</body>
</html>