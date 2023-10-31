<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang = "en">
<head>
    <title>Community</title>
    <link rel ="Stylesheet" href="${pageContext.request.contextPath}/CSS/Homepage.css">
</head>
<body>

    <div class = "container">
        <nav>
            <img class="logo" src ="${pageContext.request.contextPath}/img/logo.jpg.png">
            <ul>
                <li><a href = "index.jsp" >Home</a></li>
                <li><a href = "Community.jsp" >Community</a></li>
                <li><a href = "About us.jsp" >About us</a></li>
            </ul>
        </nav>
        <div class = "content">
            <h1>Be a Part of a Experience!</h1>
            <img class="tile2" src="${pageContext.request.contextPath}/img/community.jpg">
            <p>Join with a ever-growing community of shoppers to get your much needed groceries.</p>
                 <div>
                 <a href="Login.jsp">
                    <button type = "button"><span></span>Get to Ordering</button></a>
                 <a href="Register.jsp">
                    <button type = "button"><span></span>Join Now</button></a>
                 </div>
        </div>
    </div>
</body>

</html>