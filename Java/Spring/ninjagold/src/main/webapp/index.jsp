<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256" import=" java.util.Collections" import="java.util.ArrayList"  %>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<style>
 .headyourgold {
            display: flex;
            align-items: center;
        }

        .yourgold {

            font-weight: bolder;
            margin: 30px;
        }

        .yourgold1 {
            border: 1px solid black;
            width: 80px;

            height: 30px;

        }
        .main{
            display: flex;
            justify-content: space-evenly;
        }
        .main div{
            border: 2px solid black;
            width: 200px;
            text-align: center;
        }
        .main div *{
            margin: 30px;
        }
        .textarea{
            border: 2px solid black;
            margin: 30px;
            height: 120px;
            margin-right: 100px;
            overflow: scroll;
        }
        .green{
        color:green;
        
        }
        .red{
        color:red
        }
</style>
<body>
<div class="headyourgold">
        <p class="yourgold">Your Gold:</p>
        <p class="yourgold1">${goldSession}</p>
    </div>
    <div class="main">
        <div>
            <p style="font-weight:bold ;">farm</p>
            <p>(earns 10-20 gold)</p>
            <form action="process_money/" method="post">
               
                <input type="hidden" name="which_form" value="farm">
            <button type="submit">find gold!</button>
        </form>
        </div>
        <div>
            <p style="font-weight:bold ;">Cave</p>
            <p>(earns 10-20 gold)</p>
            <form action="process_money/" method="post">
               
                <input type="hidden" name="which_form" value="cave">
            <button type="submit">find gold!</button>
            </form>
        </div>
        <div>
            <p style="font-weight:bold ;">House</p>
            <p>(earns 10-20 gold)</p>
            <form action="process_money/" method="post">
            
                <input type="hidden" name="which_form" value="house">
            <button type="submit">find gold!</button>
            </form>
        </div>
        <div>
            <p style="font-weight:bold ;">Quest</p>
            <p>(earns 0-50 gold)</p>
            <form action="process_money" method="post">
              
                <input type="hidden" name="which_form" value="quest">
            <button type="submit">find gold!</button>
            </form>
        </div>
        
    </div>
    <p style="font-weight: bold;margin-left: 30px;">Activities</p>
    <div class="textarea">

     <c:forEach var="Activity" items="${data}">
          <c:choose>
          <c:when test="${Activity.contains('lost')}">
            <p class="red">
            <c:out value="${Activity}"></c:out></p>
            </c:when>
            <c:otherwise>
            <p class="green">
            <c:out value="${Activity}"></c:out></p>
            </c:otherwise>
            </c:choose>
            </c:forEach>
    </div>
</body>
</html>