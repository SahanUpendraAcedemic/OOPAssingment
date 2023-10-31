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
            <h1>Staff Account</h1>
            <ul>
                <li><a href = "index.jsp" >Home</a></li>
                <li><a href = "#" >Community</a></li>
                <li><a href = "#" >About us</a></li>
            </ul>
        </nav>
        <div class = "content">
            <h1>Welcome</h1>
             <c:forEach var ="one" items="${staffdetails}">
				<c:set var="id" value="${one.sid}"/>
				<c:set var="name" value="${one.staffname}"/>
				<c:set var="Email" value="${one.post}"/>
				<c:set var="Gender" value="${one.phone}"/>
            	<p>Welcome ${one.post} -> ${one.staffname} </p>
            	</c:forEach>
                 <div>
                 <form action="view" method="post">
                    <button type = "submit"><span></span>Update Catalog</button>
              	 </form>
                    <button type = "button"><span></span>Moderate Users</button>
                 <form action="review" method="post">
                    <button type = "submit"><span></span>Review Orders</button>
                 </form>
                    <a href="index.jsp">
                    <button type = "button"><span></span>Log Out</button></a>
                 </div>
        </div>
    </div>
</div>
</body>

</html>