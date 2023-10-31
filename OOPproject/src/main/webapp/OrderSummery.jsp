<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Summary</title>
<link rel ="Stylesheet" href = "${pageContext.request.contextPath}/CSS/OrderSummery.css">
</head>
<body>
   <div class = "container">
        <nav>
            <h1>Order Summary</h1>
        </nav>
        <div class = "content">
        <h1>Here is a summary of your order you can <br>update or cancel <br> your order here</h1>
        </div>
        <div class="formdiv">
        
        <table>
			<c:forEach var ="one" items="${orderdetails}">
			<c:set var="Oname" value="${one.ordername}"/>
			<c:set var="Odate" value="${one.orderdate}"/>
			<c:set var="Otype" value="${one.ordertype}"/>
			<c:set var="Ocontent" value="${one.ordercontent}"/>
			<c:set var="Odil" value="${one.diliverymethod}"/>
			<c:set var="Ouid" value="${one.ouid}"/>
			
				<tr><td> Your User ID</td>
				<td>${one.ouid}</td>
                           
				<tr><td>Order Name</td>
				<td>${one.ordername}</td>
			</tr>
				<tr><td>Order Date</td>
				<td>${one.orderdate}</td>
			</tr>
				<tr><td>Order Type</td>
				<td>${one.ordertype}</td>
			</tr>
				<tr><td>Order content</td>
				<td>${one.ordercontent}</td>
			</tr>
				<tr><td>Order Delivery Method</td>
				<td>${one.diliverymethod}</td>
			</tr>
				</c:forEach>
		
			</table>
			
			<c:url value="OrderUpdate.jsp" var="orderupdate">
			<c:param name="Oname" value="${Oname}"/>
			<c:param name="Odate" value="${Odate}"/>
			<c:param name="Otype" value="${Otype}"/>
			<c:param name="Ocontent" value="${Ocontent}"/>
			<c:param name="Odil" value="${Odil}"/>
			<c:set var="Ouid" value="${one.ouid}"/>
			</c:url>
			<a href="${orderupdate}">
			<button value="Update">Update</button>
			</a>
			<c:url value="OrderDelete.jsp" var="orderdelete">
			<c:param name="Oname" value="${Oname}"/>
			<c:param name="Odate" value="${Odate}"/>
			<c:param name="Otype" value="${Otype}"/>
			<c:param name="Ocontent" value="${Ocontent}"/>
			<c:param name="Odil" value="${Odil}"/>
			<c:set var="Ouid" value="${one.ouid}"/>
			</c:url>
			<a href="${orderdelete}">
			<button value="Delete">Delete</button></a>
			
			<a href="index.jsp">
			<button value="Confirm">Confirm</button>
			</a>
		</div>
	</div>
</body>
</html>