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
      <form:label path="expense">expense</form:label>
      <form:errors class="red"   path="expense"/>
      <form:input path="expense" value="${Traveledit.expense }"/>

    </p>
    <p>
      <form:label path="vendor">vendor</form:label>
      <form:errors class="red" path="vendor"/>
      <form:input path="vendor" value="${Traveledit.vendor }"/>

    </p>
    <p>
      <form:label path="amount">amount</form:label>
      <form:errors class="red" path="amount" />
      <form:input path="amount" value="${Traveledit.amount }"/>

    </p>
    <p>
      <form:label path="description">description</form:label>
      <form:errors class="red" path="description"/>
      <form:input path="description" value="${Traveledit.description }"/>

    </p>
    <button>submit</button>

</form:form>
</body>
</html>