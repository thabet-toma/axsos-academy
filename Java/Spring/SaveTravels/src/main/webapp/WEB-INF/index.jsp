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
<h1 style="color:blue">Save Travels</h1>
<table border="1">
  <tr>
<th>Expense</th>
   <th>vendor</th>
   <th>Amount</th>
   <th>Actions</th>
  </tr>
 <c:forEach var="i" items="${Travel }">
 <tr>
 <td>${i.expense }</td>
 <td>${i.vendor }</td>
 <td>${i.amount }</td>
 <td><a href="/edit/${ i.id}">edit</a>
 </tr>
 </c:forEach>
  
</table>

</div>
<div>
  <h1 style="color:blue;text-align:center">Add an Expense</h1>
 
  <form:form action="/" method="post" modelAttribute="travel">
    <p>
      <form:label path="expense">expense</form:label>
      <form:errors class="red"   path="expense"/>
      <form:input path="expense"/>

    </p>
    <p>
      <form:label path="vendor">vendor</form:label>
      <form:errors class="red" path="vendor"/>
      <form:input path="vendor"/>

    </p>
    <p>
      <form:label path="amount">amount</form:label>
      <form:errors class="red" path="amount"/>
      <form:input path="amount"/>

    </p>
    <p>
      <form:label path="description">description</form:label>
      <form:errors class="red" path="description"/>
      <form:input path="description"/>

    </p>
    <button>submit</button>
  </form:form>
</div>
</body>
</html>