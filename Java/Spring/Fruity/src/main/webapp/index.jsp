<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>

</head>
<body>
<table border="1">
<thead>
<th> name</th>
<th> price</th>
</thead>

 <c:forEach var="i" items="${fruits}">
        <tr>
      <td>  <c:out value="${i.name}">
        </c:out></td>
          <td>  <c:out value="${i.price}">
        </c:out></td>
        
        </tr>
    </c:forEach>

</tbody>
</table>
</body>
</html>