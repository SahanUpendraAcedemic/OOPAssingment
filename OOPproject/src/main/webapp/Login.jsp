<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang = "en">
<head>
    <title>User Login</title>
    <link rel ="Stylesheet" href = "${pageContext.request.contextPath}/CSS/use_Login.css">
    <link rel='stylesheet' href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' >
    <title>User Login</title>

</head>
<body>
    <div class="wrapper">
        <form action="LoginServlet" method="post">
            <h1>Login</h1>
            <div class="input-box">
                <input type ="text" placeholder="Username" name="username" required>
                <i class='bx bxs-user'></i>
            </div>
            <div class="input-box">
                <input type ="password" placeholder="Password" name="password" required>
                <i class='bx bxs-lock-alt'></i>
            </div>
            <button type ="submit" class ="btn">Login</button>
            <div class="register-link">
                <a href="Register.jsp">Don't have an Account?</a>
            </div>
        </form>
        <br>
        <a href="Stafflogin.jsp">
        <button type = "button" class ="btn"><span></span>Staff Login</button></a>
        <p>For Staff Use only!</p>
    </div>
    <div>
    
    
    
    
    </div>
    
</body>
    
</html>