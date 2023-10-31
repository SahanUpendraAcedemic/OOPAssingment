<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang = "en">
<head>
    <title>Staff Login</title>
 	<link rel ="Stylesheet" href = "${pageContext.request.contextPath}/CSS/adminlogin.css"> 
    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
</head>

<body>
    <div class="wrapper">
        <form action="stafflogg-in" method="post">
            <h1>Staff Login</h1>
            <div class="input-box">
                <input type ="text" placeholder="Staff Name" name="staffuname" required>
                <i class='bx bxs-user'></i>
            </div>
            <div class="input-box">
                <input type ="password" placeholder="Staff password" name="staffpass" required>
                <i class='bx bxs-lock-alt'></i>
            </div>
            <button type ="submit" class ="btn">Login</button>
        </form>
    </div>
</body>
</html>