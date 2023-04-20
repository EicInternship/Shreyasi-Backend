<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="adddata">
<table>
<tr>
<th>Product id</th>
<th>Product name</th>
<th>Product cost</th>
<th>Quantity</th>
</tr>

<c:forEach items= "${Product }" var="p">
<tr>
<td>${p.id }</td>
<td>${p.name }</td>
<td>${p.amount }</td>
<td>${p.quantity }</td>
<td><a href= "addProduct?id=${p.id}">ADD</a></td>
</tr>
</c:forEach>

</table>
</form>
<p>${Product }</p>

</body>
</html>