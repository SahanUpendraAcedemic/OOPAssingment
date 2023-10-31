<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Delete</title>
<link rel ="Stylesheet" href = "${pageContext.request.contextPath}/CSS/OrderSummery.css">
</head>
<body>
   <div class = "container">
        <nav>
            <h1>Order Delete</h1>
        </nav>
        <div class = "content">
        <h1>You are about to cancel the below order! hit confirm to proceed.</h1>
        </div>
        <div class="formdiv">
        	<Form action="delete" method="post">
        	<table>
				<%
					String oname =request.getParameter("Oname");
					String odate =request.getParameter("Odate");
					String otype =request.getParameter("Otype");
					String ocontent =request.getParameter("Ocontent");
					String dilmethod =request.getParameter("Odil");
					
				%>
					<tr><td>Order Name</td>
					<td><input type='text' name="diloname" value='<%=oname%>' readonly></td>
				</tr>
					<tr><td>Order Date</td>
					<td><input type='text' name="dilodate" value='<%=odate%>' readonly></td>
				</tr>
					<tr><td>Order Type</td>
					<td><input type='text' name="dilotype"value='<%=otype%>' readonly></td>
				</tr>
					<tr><td>Order content</td>
					<td><input type='text' name="dilocontent" value='<%=ocontent%>' readonly></td>
				</tr>
					<tr><td>Order Delivery Method</td>
					<td><input type='text' name="dilmethod" value='<%=dilmethod%>' readonly></td>
				</tr>
				</table>
				<button type="submit">Delete</button>
				</Form>
		</div>
	</div>
</body>
</html>