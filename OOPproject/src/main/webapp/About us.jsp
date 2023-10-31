<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang = "en">
<head>
    <title>About Us</title>
    <link rel ="Stylesheet" href="${pageContext.request.contextPath}/CSS/Homepage.css">
</head>
<body>

    <div class = "container">
        <nav>
            <img class="logo" src ="${pageContext.request.contextPath}/img/logo.jpg.png">
            <ul>
                <li><a href = "index.jsp" >Home</a></li>
                <li><a href = "#" >Community</a></li>
                <li><a href = "#" >About us</a></li>
            </ul>
        </nav>
        <div class = "content">
            <h1>What is ToGo Service?</h1>
            <img class="tile" src="${pageContext.request.contextPath}/img/3509263.jpg">
            <p>ToGo is the place to get your groceries in one click!</p>
                 <div>
                 <a href="index.jsp">
                    <button type = "button"><span></span>Home</button></a>
                 </div>
        </div>
    </div>
</body>

</html>