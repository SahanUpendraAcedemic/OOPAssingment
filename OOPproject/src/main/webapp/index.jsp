<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang = "en">
<head>
    <title>Home</title>
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
            <h1>To Go Service </h1>
            <p>
                Shopping reimagined, your way.
                 Our online store is your destination
                  for unparalleled variety and 
                  convenience. With our mantra, 
                  'Elevate Your Shopping Experience,'
                   we're dedicated to delivering quality 
                   and choice for all your needs. Explore fashion,
                    tech, home essentials, and unique finds from 
                    the comfort of your home. Shopping isn't 
                    just a task; it's an adventure in style and 
                    ease. Embrace the future of retail, enjoy 
                    effortless online shopping, and elevate your
                     expectations. Join us today and experience 
                     shopping like never before</p>
                 <div>
                 <a href="Login.jsp">
                    <button type = "button"><span></span>Login</button></a>
                 <a href="Register.jsp">
                    <button type = "button"><span></span>Register</button></a>
                 </div>
        </div>
    </div>
</body>

</html>