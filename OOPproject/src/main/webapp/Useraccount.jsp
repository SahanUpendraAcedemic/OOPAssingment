<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html lang = "en">
<head>
    <title>User Account</title>
    <link rel ="Stylesheet" href = "${pageContext.request.contextPath}/CSS/Homepage.css">
</head>
<body>
   <div class = "background">
    <div class = "container">
        <nav>
            <h1>User Account</h1>
            <ul>
                <li><a href = "index.jsp" >Home</a></li>
                <li><a href = "#" >Community</a></li>
                <li><a href = "#" >About us</a></li>
            </ul>
        </nav>
        <div class = "content">
            <h1>Your smart choice</h1>
             <c:forEach var ="one" items="${userdetails}">
				<c:set var="id" value="${one.uid}"/>
				<c:set var="name" value="${one.fullname}"/>
				<c:set var="Email" value="${one.username}"/>
				<c:set var="Gender" value="${one.gender}"/>
            	<p>Welcome ${one.fullname} </p>
            	</c:forEach>
                 <div>
                 <c:url value="OrderItems.jsp" var="userid">
                 <c:param name="uid" value="${id}"></c:param>
                  </c:url>
                   <a href="${userid}">
                    <button type = "button"><span></span>Order Items</button></a>
                   
                    <a href="Login.jsp">
                    <button type = "button"><span></span>Subscribe ToGo Service</button></a>
                    <a href="index.jsp">
                    <button type = "button"><span></span>Log Out</button></a>
                    
                 </div>
        </div>
    </div>
</div>
</body>

</html>