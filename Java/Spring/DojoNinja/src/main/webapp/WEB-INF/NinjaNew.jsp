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
<h1>New ninja</h1>
 <form:form action="/createNinja" method="post" modelAttribute="ninja">
    <p>
      <form:label path="dojo">expense</form:label>
      <form:errors class="red"   path="dojo"/>
      <form:select  path="dojo">
      <c:forEach var="i" items="${AllDojos}">
      <option value="${i.id}">${i.name}</option>
      </c:forEach>
      </form:select>

    </p>
    <p>
      <form:label path="firstName">First Name</form:label>
      <form:errors  path="firstName"/>
      <form:input path="firstName"/>

    </p>
    <p>
      <form:label path="lastName">Last Name</form:label>
      <form:errors path="lastName"/>
      <form:input path="lastName"/>

    </p>
    <p>
      <form:label path="age">Age</form:label>
      <form:errors  path="age"/>
      <form:input path="age"/>

    </p>
    <button>submit</button>
  </form:form>
</body>
</html>