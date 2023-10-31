<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<link rel ="Stylesheet" href = "${pageContext.request.contextPath}/CSS/OrderSummery.css">
<title>Review Orders</title>
</head>
<body>
	<div class="background">
	<div class = "container">
	<div class = "content">
	<nav>
		<h1>Order Review</h1>
	</nav>
	<div class="formdiv">
	<table>
		<tr><td>Order Name</td>
		<td>Order Date</td>
		<td>Order Type</td>
		<td>Order Content</td>
		<td>User ID belong to the order</td></tr>
		
		<c:forEach var="o" items="${order}">
			<tr><td>
			${o.ordername}
			</td><td>
			${o.orderdate}
			</td><td>
			${o.ordertype}
			</td><td>
			${o.ordercontent}
			</td><td>
			${o.ouid}
			</td></tr>
		</c:forEach>

		</table>
				<a href="Staffaccount.jsp">
				<button>Done</button></a>
		</div>
		</div>
	</div>
</div>
</body>
</html>